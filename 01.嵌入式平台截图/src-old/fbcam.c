/*      Framebuffer Video Capture Testing Tool
 *
 *      For testing a Video for Linux Two video capture driver
 *
 *      This program was written by Olivier Carmona, based on Bill Dirks.
 *      This program is in the public domain.
 *
 */
#include <unistd.h>
#include <stdlib.h>
#include <string.h>
#include <sys/time.h>
#include <sys/ioctl.h>
#include <sys/types.h>
#include <fcntl.h>
#include <linux/fb.h>
#include <stdio.h>
#include <sys/mman.h>
#include <errno.h>
#include <math.h>

#include <linux/fs.h>
#include <linux/kernel.h>
#include <linux/videodev.h>

#define WCAM_VIDIOCSCAMREG       _IOW('v', 211, struct reg_set_s)
#define WCAM_VIDIOCGCAMREG       _IOWR('v', 212, struct reg_set_s)
#define WCAM_VIDIOCSCIREG        _IOW('v', 213, struct reg_set_s)
#define WCAM_VIDIOCGCIREG        _IOWR('v', 214, struct reg_set_s)
#define WCAM_VIDIOCSINFOR        _IOW('v', 215, struct reg_set_s)
#define WCAM_VIDIOCGINFOR        _IOWR('v', 216, struct reg_set_s)

#define VID_PIX_FLAGS 	V4L2_FMT_FLAG_ODDFIELD /* Video Output Format */
//#define VID_STD	  	"NTSC" /* Default Standard */
#define VID_WIDTH  	800 /* Default Width */
#define VID_HEIGHT 	480 /* Default Height */
#define VID_STREAMING 	1 /* Streaming mode boolean */
#define STREAMBUFS	4 /* Number of streaming buffer */

#define FB_DEV0 	"/dev/fb0" /* Device Name */

char fb_device[] = FB_DEV0;

const char bmp_head800_480[] = {
0x42,0x4d,0x00,0x90,0x01,0x00,0x00,0x00,0x00,0x00,0x42,0x00,0x00,0x00,0x28,0x00,
0x00,0x00,0x20,0x03,0x00,0x00,0x20,0xfe,0xff,0xff,0x01,0x00,0x10,0x00,0x03,0x00,
0x00,0x00,0x00,0xB8,0x0B,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,
0x00,0x00,0x00,0x00,0x00,0x00,0x00,0xf8,0x00,0x00,0xe0,0x07,0x00,0x00,0x1f,0x00,
0x00,0x00
};

static  char filename[30];
FILE *bmpFile;
static  int capframe = 0;

int main (int argc, char *argv[])
{
	int fd_fb;
	struct fb_var_screeninfo fbvar;
	struct fb_fix_screeninfo fbfix;
	char *frame_buffer;
	int y, format;
	char buff[800];
 
	fd_fb = open(fb_device, O_RDWR);
	if (fd_fb < 0)
	{
		perror("fbdev open");
		return 0;
	}
	memset(&fbvar, 0, sizeof(fbvar));
	memset(&fbfix, 0, sizeof(fbfix));
	memset(buff,0xf0,800);
	ioctl(fd_fb, FBIOGET_VSCREENINFO, &fbvar);
	ioctl(fd_fb, FBIOGET_FSCREENINFO, &fbfix);

	frame_buffer = (char *) mmap(0, fbfix.smem_len, PROT_READ | PROT_WRITE,MAP_SHARED, fd_fb, 0);
	
	for (;;)
	{
	getchar();
        capframe++;
		sprintf(filename,"/mnt/nfs/0%d.bmp",capframe);
		bmpFile=fopen(filename, "w+");
		fwrite(bmp_head800_480,1,66,bmpFile);
		for(y=0;y < 960;y++)
			fwrite(frame_buffer + y * 800  ,1,800,bmpFile);
		sleep(1);
		fclose(bmpFile);
	}

	return 0;
}

