namespace RFID_Reader_Csharp
{
    partial class Form1
    {
        /// <summary>
        /// 必需的设计器变量。
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// 清理所有正在使用的资源。
        /// </summary>
        /// <param name="disposing">如果应释放托管资源，为 true；否则为 false。</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows 窗体设计器生成的代码

        /// <summary>
        /// 设计器支持所需的方法 - 不要
        /// 使用代码编辑器修改此方法的内容。
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.gbx_conn = new System.Windows.Forms.GroupBox();
            this.Reset_FW = new System.Windows.Forms.Button();
            this.txtFWName = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.cbxPort = new System.Windows.Forms.ComboBox();
            this.cbxBaudRate = new System.Windows.Forms.ComboBox();
            this.btnConn = new System.Windows.Forms.Button();
            this.toolTip1 = new System.Windows.Forms.ToolTip(this.components);
            this.txtReceive = new System.Windows.Forms.TextBox();
            this.txtSend = new System.Windows.Forms.TextBox();
            this.btn_clear_rx = new System.Windows.Forms.Button();
            this.btnClearCnt = new System.Windows.Forms.Button();
            this.btnSend = new System.Windows.Forms.Button();
            this.timerAutoSend = new System.Windows.Forms.Timer(this.components);
            this.btnContinue = new System.Windows.Forms.Button();
            this.gbx_setfreq = new System.Windows.Forms.GroupBox();
            this.label47 = new System.Windows.Forms.Label();
            this.label46 = new System.Windows.Forms.Label();
            this.txtChIndexEnd = new System.Windows.Forms.TextBox();
            this.txtChIndexBegin = new System.Windows.Forms.TextBox();
            this.btnInsertRfCh = new System.Windows.Forms.Button();
            this.btnGetChannel = new System.Windows.Forms.Button();
            this.btnSetRegion = new System.Windows.Forms.Button();
            this.btnSetFhss = new System.Windows.Forms.Button();
            this.cbxChannel = new System.Windows.Forms.ComboBox();
            this.cbxRegion = new System.Windows.Forms.ComboBox();
            this.btnSetFreq = new System.Windows.Forms.Button();
            this.gbxRxData = new System.Windows.Forms.GroupBox();
            this.cbxRxVisable = new System.Windows.Forms.CheckBox();
            this.cbxAutoClear = new System.Windows.Forms.CheckBox();
            this.gbx_inventory = new System.Windows.Forms.GroupBox();
            this.AntStayTime = new System.Windows.Forms.TextBox();
            this.SetAnt = new System.Windows.Forms.Button();
            this.txtSendDelay = new System.Windows.Forms.TextBox();
            this.btnStopRD = new System.Windows.Forms.Button();
            this.label15 = new System.Windows.Forms.Label();
            this.txtRDMultiNum = new System.Windows.Forms.TextBox();
            this.btnInvtMulti = new System.Windows.Forms.Button();
            this.btnSetCW = new System.Windows.Forms.Button();
            this.label4 = new System.Windows.Forms.Label();
            this.cbxQBasic = new System.Windows.Forms.ComboBox();
            this.label3 = new System.Windows.Forms.Label();
            this.btnInvtBasic = new System.Windows.Forms.Button();
            this.dgvEpcBasic = new System.Windows.Forms.DataGridView();
            this.contextMenuStrip1 = new System.Windows.Forms.ContextMenuStrip(this.components);
            this.saveAsCsvToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.gbxEpcTableBasic = new System.Windows.Forms.GroupBox();
            this.btnChangeBaudrate = new System.Windows.Forms.Button();
            this.btn_clear_epc1 = new System.Windows.Forms.Button();
            this.ANT8 = new System.Windows.Forms.CheckBox();
            this.ANT7 = new System.Windows.Forms.CheckBox();
            this.ANT6 = new System.Windows.Forms.CheckBox();
            this.ANT5 = new System.Windows.Forms.CheckBox();
            this.ANT4 = new System.Windows.Forms.CheckBox();
            this.ANT3 = new System.Windows.Forms.CheckBox();
            this.ANT2 = new System.Windows.Forms.CheckBox();
            this.ANT1 = new System.Windows.Forms.CheckBox();
            this.tabControl1 = new System.Windows.Forms.TabControl();
            this.tabPage1 = new System.Windows.Forms.TabPage();
            this.ANT16 = new System.Windows.Forms.CheckBox();
            this.ANT15 = new System.Windows.Forms.CheckBox();
            this.ANT14 = new System.Windows.Forms.CheckBox();
            this.ANT13 = new System.Windows.Forms.CheckBox();
            this.ANT12 = new System.Windows.Forms.CheckBox();
            this.ANT11 = new System.Windows.Forms.CheckBox();
            this.ANT10 = new System.Windows.Forms.CheckBox();
            this.ANT9 = new System.Windows.Forms.CheckBox();
            this.groupBox4 = new System.Windows.Forms.GroupBox();
            this.btnSetModuleSleep = new System.Windows.Forms.Button();
            this.bynSaveConfigToNv = new System.Windows.Forms.Button();
            this.cbxSaveNvConfig = new System.Windows.Forms.CheckBox();
            this.cbxMode = new System.Windows.Forms.ComboBox();
            this.btnSetMode = new System.Windows.Forms.Button();
            this.pbx_Inv_Indicator = new System.Windows.Forms.PictureBox();
            this.gbxRfPower = new System.Windows.Forms.GroupBox();
            this.btnGetPaPower = new System.Windows.Forms.Button();
            this.cbxPaPower = new System.Windows.Forms.ComboBox();
            this.btnSetPaPower = new System.Windows.Forms.Button();
            this.gbxStatus = new System.Windows.Forms.GroupBox();
            this.txtFirmwareVersion = new System.Windows.Forms.TextBox();
            this.txtHardwareVersion = new System.Windows.Forms.TextBox();
            this.label37 = new System.Windows.Forms.Label();
            this.labelHardwareVersion = new System.Windows.Forms.Label();
            this.label17 = new System.Windows.Forms.Label();
            this.txtCOMRxCnt = new System.Windows.Forms.TextBox();
            this.label16 = new System.Windows.Forms.Label();
            this.txtCOMTxCnt = new System.Windows.Forms.TextBox();
            this.tabPage2 = new System.Windows.Forms.TabPage();
            this.groupBoxMonzaCmds = new System.Windows.Forms.GroupBox();
            this.label36 = new System.Windows.Forms.Label();
            this.btnMonzaQTWrite = new System.Windows.Forms.Button();
            this.tbxMonzaQTAccessPwd = new System.Windows.Forms.TextBox();
            this.btnMonzaQTRead = new System.Windows.Forms.Button();
            this.cbxMonzaQT_MEM = new System.Windows.Forms.CheckBox();
            this.cbxMonzaQT_SR = new System.Windows.Forms.CheckBox();
            this.gbxStatus2 = new System.Windows.Forms.GroupBox();
            this.rtbxStatus = new System.Windows.Forms.RichTextBox();
            this.txtOperateEpc = new System.Windows.Forms.TextBox();
            this.label27 = new System.Windows.Forms.Label();
            this.labelStatus = new System.Windows.Forms.Label();
            this.groupBox5 = new System.Windows.Forms.GroupBox();
            this.label24 = new System.Windows.Forms.Label();
            this.tbxNxpCmdAccessPwd = new System.Windows.Forms.TextBox();
            this.cbxReadProtectReset = new System.Windows.Forms.CheckBox();
            this.btnChangeConfig = new System.Windows.Forms.Button();
            this.btnReadProtect = new System.Windows.Forms.Button();
            this.btnChangeEas = new System.Windows.Forms.Button();
            this.label48 = new System.Windows.Forms.Label();
            this.cbxSetEas = new System.Windows.Forms.CheckBox();
            this.txtConfigData = new System.Windows.Forms.TextBox();
            this.btnEasAlarm = new System.Windows.Forms.Button();
            this.inv_mode = new System.Windows.Forms.CheckBox();
            this.gbxKill = new System.Windows.Forms.GroupBox();
            this.labelKillRFU = new System.Windows.Forms.Label();
            this.textBoxKillRFU = new System.Windows.Forms.TextBox();
            this.label44 = new System.Windows.Forms.Label();
            this.textBoxKillPwd = new System.Windows.Forms.TextBox();
            this.buttonKill = new System.Windows.Forms.Button();
            this.gBxLock = new System.Windows.Forms.GroupBox();
            this.cbxLockUserAction = new System.Windows.Forms.ComboBox();
            this.cbxLockTIDAction = new System.Windows.Forms.ComboBox();
            this.cbxLockEPCAction = new System.Windows.Forms.ComboBox();
            this.cbxLockAccessAction = new System.Windows.Forms.ComboBox();
            this.cbxLockKillAction = new System.Windows.Forms.ComboBox();
            this.checkBoxUser = new System.Windows.Forms.CheckBox();
            this.checkBoxTID = new System.Windows.Forms.CheckBox();
            this.checkBoxEPC = new System.Windows.Forms.CheckBox();
            this.checkBoxAccessPwd = new System.Windows.Forms.CheckBox();
            this.checkBoxKillPwd = new System.Windows.Forms.CheckBox();
            this.buttonLock = new System.Windows.Forms.Button();
            this.label42 = new System.Windows.Forms.Label();
            this.textBoxLockAccessPwd = new System.Windows.Forms.TextBox();
            this.gbxSelect = new System.Windows.Forms.GroupBox();
            this.label34 = new System.Windows.Forms.Label();
            this.label35 = new System.Windows.Forms.Label();
            this.txtGetSelLength = new System.Windows.Forms.TextBox();
            this.txtGetSelMask = new System.Windows.Forms.TextBox();
            this.btnGetSelect = new System.Windows.Forms.Button();
            this.label33 = new System.Windows.Forms.Label();
            this.txtSelMask = new System.Windows.Forms.TextBox();
            this.ckxTruncated = new System.Windows.Forms.CheckBox();
            this.label32 = new System.Windows.Forms.Label();
            this.txtSelLength = new System.Windows.Forms.TextBox();
            this.label31 = new System.Windows.Forms.Label();
            this.txtSelPrt0 = new System.Windows.Forms.TextBox();
            this.label30 = new System.Windows.Forms.Label();
            this.txtSelPrt2 = new System.Windows.Forms.TextBox();
            this.label29 = new System.Windows.Forms.Label();
            this.txtSelPrt1 = new System.Windows.Forms.TextBox();
            this.txtSelPrt3 = new System.Windows.Forms.TextBox();
            this.label28 = new System.Windows.Forms.Label();
            this.cbxSelMemBank = new System.Windows.Forms.ComboBox();
            this.cbxAction = new System.Windows.Forms.ComboBox();
            this.cbxSelTarget = new System.Windows.Forms.ComboBox();
            this.btnSetSelect = new System.Windows.Forms.Button();
            this.gbx_comcnt_adv = new System.Windows.Forms.GroupBox();
            this.btnClearCntAdv = new System.Windows.Forms.Button();
            this.label18 = new System.Windows.Forms.Label();
            this.txtCOMRxCnt_adv = new System.Windows.Forms.TextBox();
            this.label19 = new System.Windows.Forms.Label();
            this.txtCOMTxCnt_adv = new System.Windows.Forms.TextBox();
            this.gbxAccess = new System.Windows.Forms.GroupBox();
            this.label5 = new System.Windows.Forms.Label();
            this.txtWordCnt0 = new System.Windows.Forms.TextBox();
            this.txtWordPtr0 = new System.Windows.Forms.TextBox();
            this.label26 = new System.Windows.Forms.Label();
            this.label25 = new System.Windows.Forms.Label();
            this.txtRwAccPassWord = new System.Windows.Forms.TextBox();
            this.txtInvtRWData = new System.Windows.Forms.TextBox();
            this.btnInvtWrtie = new System.Windows.Forms.Button();
            this.label22 = new System.Windows.Forms.Label();
            this.label21 = new System.Windows.Forms.Label();
            this.label20 = new System.Windows.Forms.Label();
            this.cbxMemBank = new System.Windows.Forms.ComboBox();
            this.txtWordCnt1 = new System.Windows.Forms.TextBox();
            this.txtWordPtr1 = new System.Windows.Forms.TextBox();
            this.btn_invtread = new System.Windows.Forms.Button();
            this.btnInvtAdv = new System.Windows.Forms.Button();
            this.gbxEpcTableAdv = new System.Windows.Forms.GroupBox();
            this.btn_clear_epc2 = new System.Windows.Forms.Button();
            this.dgv_epc2 = new System.Windows.Forms.DataGridView();
            this.gbxSetQuery = new System.Windows.Forms.GroupBox();
            this.cbxQAdv = new System.Windows.Forms.ComboBox();
            this.btnGetQuery = new System.Windows.Forms.Button();
            this.btnSetQuery = new System.Windows.Forms.Button();
            this.label14 = new System.Windows.Forms.Label();
            this.cbxTarget = new System.Windows.Forms.ComboBox();
            this.label13 = new System.Windows.Forms.Label();
            this.cbxSession = new System.Windows.Forms.ComboBox();
            this.label12 = new System.Windows.Forms.Label();
            this.cbxSel = new System.Windows.Forms.ComboBox();
            this.label11 = new System.Windows.Forms.Label();
            this.cbxTRext = new System.Windows.Forms.ComboBox();
            this.label10 = new System.Windows.Forms.Label();
            this.label9 = new System.Windows.Forms.Label();
            this.cbxM = new System.Windows.Forms.ComboBox();
            this.label8 = new System.Windows.Forms.Label();
            this.cbxDR = new System.Windows.Forms.ComboBox();
            this.tabPage3 = new System.Windows.Forms.TabPage();
            this.lanel_sum = new System.Windows.Forms.Label();
            this.tv_sum = new System.Windows.Forms.TextBox();
            this.button1 = new System.Windows.Forms.Button();
            this.image_lock = new System.Windows.Forms.PictureBox();
            this.gbxIoControl = new System.Windows.Forms.GroupBox();
            this.cbxIoDircetion = new System.Windows.Forms.ComboBox();
            this.cbxIoLevel = new System.Windows.Forms.ComboBox();
            this.btnSetIoDirection = new System.Windows.Forms.Button();
            this.btnSetIO = new System.Windows.Forms.Button();
            this.btnGetIO = new System.Windows.Forms.Button();
            this.cbxIO = new System.Windows.Forms.ComboBox();
            this.btnScanRssi = new System.Windows.Forms.Button();
            this.btnScanJammer = new System.Windows.Forms.Button();
            this.groupBox2 = new System.Windows.Forms.GroupBox();
            this.tbxCoupling = new System.Windows.Forms.TextBox();
            this.label45 = new System.Windows.Forms.Label();
            this.tbxAntennaGain = new System.Windows.Forms.TextBox();
            this.label43 = new System.Windows.Forms.Label();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.tbxSignalThreshold = new System.Windows.Forms.TextBox();
            this.label23 = new System.Windows.Forms.Label();
            this.btnSetModemPara = new System.Windows.Forms.Button();
            this.label7 = new System.Windows.Forms.Label();
            this.cbxMixerGain = new System.Windows.Forms.ComboBox();
            this.label6 = new System.Windows.Forms.Label();
            this.cbxIFAmpGain = new System.Windows.Forms.ComboBox();
            this.btnGetModemPara = new System.Windows.Forms.Button();
            this.hBarChartRssi = new BarChart.HBarChart();
            this.hBarChartJammer = new BarChart.HBarChart();
            this.gbxRdIntrgtMem = new System.Windows.Forms.GroupBox();
            this.timerCheckReader = new System.Windows.Forms.Timer(this.components);
            this.tmrCheckEpc = new System.Windows.Forms.Timer(this.components);
            this.btn_checkout = new System.Windows.Forms.Button();
            this.btn_commit = new System.Windows.Forms.Button();
            this.tv_notice = new System.Windows.Forms.Label();
            this.btn_card_ready = new System.Windows.Forms.Button();
            this.gbx_conn.SuspendLayout();
            this.gbx_setfreq.SuspendLayout();
            this.gbxRxData.SuspendLayout();
            this.gbx_inventory.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dgvEpcBasic)).BeginInit();
            this.contextMenuStrip1.SuspendLayout();
            this.gbxEpcTableBasic.SuspendLayout();
            this.tabControl1.SuspendLayout();
            this.tabPage1.SuspendLayout();
            this.groupBox4.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pbx_Inv_Indicator)).BeginInit();
            this.gbxRfPower.SuspendLayout();
            this.gbxStatus.SuspendLayout();
            this.tabPage2.SuspendLayout();
            this.groupBoxMonzaCmds.SuspendLayout();
            this.gbxStatus2.SuspendLayout();
            this.groupBox5.SuspendLayout();
            this.gbxKill.SuspendLayout();
            this.gBxLock.SuspendLayout();
            this.gbxSelect.SuspendLayout();
            this.gbx_comcnt_adv.SuspendLayout();
            this.gbxAccess.SuspendLayout();
            this.gbxEpcTableAdv.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dgv_epc2)).BeginInit();
            this.gbxSetQuery.SuspendLayout();
            this.tabPage3.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.image_lock)).BeginInit();
            this.gbxIoControl.SuspendLayout();
            this.groupBox2.SuspendLayout();
            this.groupBox1.SuspendLayout();
            this.SuspendLayout();
            // 
            // gbx_conn
            // 
            this.gbx_conn.Controls.Add(this.Reset_FW);
            this.gbx_conn.Controls.Add(this.txtFWName);
            this.gbx_conn.Controls.Add(this.label2);
            this.gbx_conn.Controls.Add(this.label1);
            this.gbx_conn.Controls.Add(this.cbxPort);
            this.gbx_conn.Controls.Add(this.cbxBaudRate);
            this.gbx_conn.Controls.Add(this.btnConn);
            this.gbx_conn.Font = new System.Drawing.Font("Arial", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.gbx_conn.Location = new System.Drawing.Point(697, 6);
            this.gbx_conn.Name = "gbx_conn";
            this.gbx_conn.Size = new System.Drawing.Size(305, 77);
            this.gbx_conn.TabIndex = 0;
            this.gbx_conn.TabStop = false;
            this.gbx_conn.Text = "串口配置";
            // 
            // Reset_FW
            // 
            this.Reset_FW.Location = new System.Drawing.Point(138, 115);
            this.Reset_FW.Name = "Reset_FW";
            this.Reset_FW.Size = new System.Drawing.Size(108, 31);
            this.Reset_FW.TabIndex = 22;
            this.Reset_FW.Text = "Reset_FW";
            this.Reset_FW.UseVisualStyleBackColor = true;
            this.Reset_FW.Visible = false;
            this.Reset_FW.Click += new System.EventHandler(this.Reset_FW_Click);
            // 
            // txtFWName
            // 
            this.txtFWName.Location = new System.Drawing.Point(123, 84);
            this.txtFWName.Name = "txtFWName";
            this.txtFWName.ReadOnly = true;
            this.txtFWName.Size = new System.Drawing.Size(171, 21);
            this.txtFWName.TabIndex = 6;
            this.txtFWName.Visible = false;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(134, 54);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(65, 15);
            this.label2.TabIndex = 4;
            this.label2.Text = "Baud Rate";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(134, 23);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(51, 15);
            this.label1.TabIndex = 3;
            this.label1.Text = "Port No.";
            // 
            // cbxPort
            // 
            this.cbxPort.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbxPort.FormattingEnabled = true;
            this.cbxPort.Location = new System.Drawing.Point(205, 17);
            this.cbxPort.Name = "cbxPort";
            this.cbxPort.Size = new System.Drawing.Size(89, 23);
            this.cbxPort.TabIndex = 2;
            // 
            // cbxBaudRate
            // 
            this.cbxBaudRate.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbxBaudRate.FormattingEnabled = true;
            this.cbxBaudRate.Items.AddRange(new object[] {
            "9600",
            "19200",
            "115200"});
            this.cbxBaudRate.Location = new System.Drawing.Point(205, 50);
            this.cbxBaudRate.Name = "cbxBaudRate";
            this.cbxBaudRate.Size = new System.Drawing.Size(89, 23);
            this.cbxBaudRate.TabIndex = 1;
            // 
            // btnConn
            // 
            this.btnConn.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btnConn.Enabled = false;
            this.btnConn.Location = new System.Drawing.Point(8, 22);
            this.btnConn.Name = "btnConn";
            this.btnConn.Size = new System.Drawing.Size(122, 48);
            this.btnConn.TabIndex = 0;
            this.btnConn.Tag = "0";
            this.btnConn.Text = "连接";
            this.btnConn.UseVisualStyleBackColor = false;
            this.btnConn.Click += new System.EventHandler(this.btnConn_Click);
            // 
            // txtReceive
            // 
            this.txtReceive.AllowDrop = true;
            this.txtReceive.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.txtReceive.Font = new System.Drawing.Font("Courier New", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtReceive.Location = new System.Drawing.Point(6, 45);
            this.txtReceive.MaxLength = 65536;
            this.txtReceive.Multiline = true;
            this.txtReceive.Name = "txtReceive";
            this.txtReceive.ReadOnly = true;
            this.txtReceive.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            this.txtReceive.Size = new System.Drawing.Size(681, 134);
            this.txtReceive.TabIndex = 1;
            this.txtReceive.TextChanged += new System.EventHandler(this.txtReceive_TextChanged);
            this.txtReceive.DoubleClick += new System.EventHandler(this.txtReceive_DoubleClick);
            // 
            // txtSend
            // 
            this.txtSend.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.txtSend.Font = new System.Drawing.Font("Arial", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtSend.Location = new System.Drawing.Point(102, 550);
            this.txtSend.Name = "txtSend";
            this.txtSend.Size = new System.Drawing.Size(586, 21);
            this.txtSend.TabIndex = 2;
            this.txtSend.DoubleClick += new System.EventHandler(this.txtSend_DoubleClick);
            // 
            // btn_clear_rx
            // 
            this.btn_clear_rx.Location = new System.Drawing.Point(431, 12);
            this.btn_clear_rx.Name = "btn_clear_rx";
            this.btn_clear_rx.Size = new System.Drawing.Size(75, 29);
            this.btn_clear_rx.TabIndex = 3;
            this.btn_clear_rx.Text = "Clear";
            this.btn_clear_rx.UseVisualStyleBackColor = true;
            this.btn_clear_rx.Click += new System.EventHandler(this.btn_clear_rx_Click);
            // 
            // btnClearCnt
            // 
            this.btnClearCnt.Location = new System.Drawing.Point(6, 8);
            this.btnClearCnt.Name = "btnClearCnt";
            this.btnClearCnt.Size = new System.Drawing.Size(87, 29);
            this.btnClearCnt.TabIndex = 5;
            this.btnClearCnt.Text = "Reset";
            this.btnClearCnt.UseVisualStyleBackColor = true;
            this.btnClearCnt.Click += new System.EventHandler(this.btn_clear_cnt_Click);
            // 
            // btnSend
            // 
            this.btnSend.Location = new System.Drawing.Point(9, 546);
            this.btnSend.Name = "btnSend";
            this.btnSend.Size = new System.Drawing.Size(87, 29);
            this.btnSend.TabIndex = 6;
            this.btnSend.Text = "Send";
            this.btnSend.UseVisualStyleBackColor = true;
            this.btnSend.Click += new System.EventHandler(this.btn_Send_Click);
            // 
            // timerAutoSend
            // 
            this.timerAutoSend.Tick += new System.EventHandler(this.timerAutoSend_Tick);
            // 
            // btnContinue
            // 
            this.btnContinue.Location = new System.Drawing.Point(10, 88);
            this.btnContinue.Name = "btnContinue";
            this.btnContinue.Size = new System.Drawing.Size(87, 29);
            this.btnContinue.TabIndex = 9;
            this.btnContinue.Text = "Continue";
            this.btnContinue.UseVisualStyleBackColor = true;
            this.btnContinue.Click += new System.EventHandler(this.btnContinue_Click);
            // 
            // gbx_setfreq
            // 
            this.gbx_setfreq.Controls.Add(this.label47);
            this.gbx_setfreq.Controls.Add(this.label46);
            this.gbx_setfreq.Controls.Add(this.txtChIndexEnd);
            this.gbx_setfreq.Controls.Add(this.txtChIndexBegin);
            this.gbx_setfreq.Controls.Add(this.btnInsertRfCh);
            this.gbx_setfreq.Controls.Add(this.btnGetChannel);
            this.gbx_setfreq.Controls.Add(this.btnSetRegion);
            this.gbx_setfreq.Controls.Add(this.btnSetFhss);
            this.gbx_setfreq.Controls.Add(this.cbxChannel);
            this.gbx_setfreq.Controls.Add(this.cbxRegion);
            this.gbx_setfreq.Controls.Add(this.btnSetFreq);
            this.gbx_setfreq.Location = new System.Drawing.Point(697, 178);
            this.gbx_setfreq.Name = "gbx_setfreq";
            this.gbx_setfreq.Size = new System.Drawing.Size(305, 122);
            this.gbx_setfreq.TabIndex = 16;
            this.gbx_setfreq.TabStop = false;
            this.gbx_setfreq.Text = "RF Channel Setting";
            this.gbx_setfreq.Visible = false;
            // 
            // label47
            // 
            this.label47.AutoSize = true;
            this.label47.Location = new System.Drawing.Point(196, 95);
            this.label47.Name = "label47";
            this.label47.Size = new System.Drawing.Size(32, 15);
            this.label47.TabIndex = 16;
            this.label47.Text = "Stop";
            // 
            // label46
            // 
            this.label46.AutoSize = true;
            this.label46.Location = new System.Drawing.Point(111, 96);
            this.label46.Name = "label46";
            this.label46.Size = new System.Drawing.Size(32, 15);
            this.label46.TabIndex = 15;
            this.label46.Text = "Start";
            // 
            // txtChIndexEnd
            // 
            this.txtChIndexEnd.Location = new System.Drawing.Point(227, 93);
            this.txtChIndexEnd.Name = "txtChIndexEnd";
            this.txtChIndexEnd.Size = new System.Drawing.Size(38, 21);
            this.txtChIndexEnd.TabIndex = 14;
            this.txtChIndexEnd.Text = "5";
            this.txtChIndexEnd.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // txtChIndexBegin
            // 
            this.txtChIndexBegin.Location = new System.Drawing.Point(143, 93);
            this.txtChIndexBegin.Name = "txtChIndexBegin";
            this.txtChIndexBegin.Size = new System.Drawing.Size(38, 21);
            this.txtChIndexBegin.TabIndex = 13;
            this.txtChIndexBegin.Text = "1";
            this.txtChIndexBegin.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // btnInsertRfCh
            // 
            this.btnInsertRfCh.Location = new System.Drawing.Point(8, 88);
            this.btnInsertRfCh.Name = "btnInsertRfCh";
            this.btnInsertRfCh.Size = new System.Drawing.Size(87, 29);
            this.btnInsertRfCh.TabIndex = 8;
            this.btnInsertRfCh.Text = "Insert RFCH";
            this.btnInsertRfCh.UseVisualStyleBackColor = true;
            this.btnInsertRfCh.Click += new System.EventHandler(this.btnInsertRfCh_Click);
            // 
            // btnGetChannel
            // 
            this.btnGetChannel.Location = new System.Drawing.Point(219, 20);
            this.btnGetChannel.Name = "btnGetChannel";
            this.btnGetChannel.Size = new System.Drawing.Size(75, 29);
            this.btnGetChannel.TabIndex = 7;
            this.btnGetChannel.Text = "Get RFCH";
            this.btnGetChannel.UseVisualStyleBackColor = true;
            this.btnGetChannel.Click += new System.EventHandler(this.btnGetChannel_Click);
            // 
            // btnSetRegion
            // 
            this.btnSetRegion.Location = new System.Drawing.Point(8, 20);
            this.btnSetRegion.Name = "btnSetRegion";
            this.btnSetRegion.Size = new System.Drawing.Size(87, 29);
            this.btnSetRegion.TabIndex = 6;
            this.btnSetRegion.Text = "Set Region";
            this.btnSetRegion.UseVisualStyleBackColor = true;
            this.btnSetRegion.Click += new System.EventHandler(this.btnSetRegion_Click);
            // 
            // btnSetFhss
            // 
            this.btnSetFhss.Location = new System.Drawing.Point(219, 55);
            this.btnSetFhss.Name = "btnSetFhss";
            this.btnSetFhss.Size = new System.Drawing.Size(75, 29);
            this.btnSetFhss.TabIndex = 5;
            this.btnSetFhss.Text = "FHSS OFF";
            this.btnSetFhss.UseVisualStyleBackColor = true;
            this.btnSetFhss.Click += new System.EventHandler(this.btnSetFhss_Click);
            // 
            // cbxChannel
            // 
            this.cbxChannel.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbxChannel.FormattingEnabled = true;
            this.cbxChannel.Items.AddRange(new object[] {
            "920.125MHz",
            "920.375MHz",
            "920.625MHz",
            "920.875MHz",
            "921.125MHz",
            "921.375MHz",
            "921.625MHz",
            "921.875MHz",
            "922.125MHz",
            "922.375MHz",
            "922.625MHz",
            "922.875MHz",
            "923.125MHz",
            "923.375MHz",
            "923.625MHz",
            "923.875MHz",
            "924.125MHz",
            "924.375MHz",
            "924.625MHz",
            "924.875MHz"});
            this.cbxChannel.Location = new System.Drawing.Point(101, 59);
            this.cbxChannel.Name = "cbxChannel";
            this.cbxChannel.Size = new System.Drawing.Size(95, 23);
            this.cbxChannel.TabIndex = 4;
            // 
            // cbxRegion
            // 
            this.cbxRegion.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbxRegion.FormattingEnabled = true;
            this.cbxRegion.Items.AddRange(new object[] {
            "China2",
            "China1",
            "US",
            "Europe",
            "Korea"});
            this.cbxRegion.Location = new System.Drawing.Point(101, 26);
            this.cbxRegion.Name = "cbxRegion";
            this.cbxRegion.Size = new System.Drawing.Size(95, 23);
            this.cbxRegion.TabIndex = 3;
            this.cbxRegion.SelectedIndexChanged += new System.EventHandler(this.cbxRegion_SelectedIndexChanged);
            // 
            // btnSetFreq
            // 
            this.btnSetFreq.Location = new System.Drawing.Point(8, 55);
            this.btnSetFreq.Name = "btnSetFreq";
            this.btnSetFreq.Size = new System.Drawing.Size(87, 29);
            this.btnSetFreq.TabIndex = 0;
            this.btnSetFreq.Text = "Set RFCH";
            this.btnSetFreq.UseVisualStyleBackColor = true;
            this.btnSetFreq.Click += new System.EventHandler(this.btnSetFreq_Click);
            // 
            // gbxRxData
            // 
            this.gbxRxData.Controls.Add(this.cbxRxVisable);
            this.gbxRxData.Controls.Add(this.cbxAutoClear);
            this.gbxRxData.Controls.Add(this.btn_clear_rx);
            this.gbxRxData.Controls.Add(this.txtReceive);
            this.gbxRxData.Location = new System.Drawing.Point(0, 355);
            this.gbxRxData.Name = "gbxRxData";
            this.gbxRxData.Size = new System.Drawing.Size(691, 185);
            this.gbxRxData.TabIndex = 17;
            this.gbxRxData.TabStop = false;
            this.gbxRxData.Text = "Receive Data";
            // 
            // cbxRxVisable
            // 
            this.cbxRxVisable.AutoSize = true;
            this.cbxRxVisable.Location = new System.Drawing.Point(613, 16);
            this.cbxRxVisable.Name = "cbxRxVisable";
            this.cbxRxVisable.Size = new System.Drawing.Size(67, 19);
            this.cbxRxVisable.TabIndex = 5;
            this.cbxRxVisable.Text = "Visable";
            this.cbxRxVisable.UseVisualStyleBackColor = true;
            // 
            // cbxAutoClear
            // 
            this.cbxAutoClear.AutoSize = true;
            this.cbxAutoClear.Checked = true;
            this.cbxAutoClear.CheckState = System.Windows.Forms.CheckState.Checked;
            this.cbxAutoClear.Location = new System.Drawing.Point(529, 16);
            this.cbxAutoClear.Name = "cbxAutoClear";
            this.cbxAutoClear.Size = new System.Drawing.Size(77, 19);
            this.cbxAutoClear.TabIndex = 4;
            this.cbxAutoClear.Text = "Autoclear";
            this.cbxAutoClear.UseVisualStyleBackColor = true;
            this.cbxAutoClear.CheckedChanged += new System.EventHandler(this.cbxAutoClear_CheckedChanged);
            // 
            // gbx_inventory
            // 
            this.gbx_inventory.Controls.Add(this.AntStayTime);
            this.gbx_inventory.Controls.Add(this.SetAnt);
            this.gbx_inventory.Controls.Add(this.txtSendDelay);
            this.gbx_inventory.Controls.Add(this.btnStopRD);
            this.gbx_inventory.Controls.Add(this.label15);
            this.gbx_inventory.Controls.Add(this.txtRDMultiNum);
            this.gbx_inventory.Controls.Add(this.btnInvtMulti);
            this.gbx_inventory.Controls.Add(this.btnSetCW);
            this.gbx_inventory.Controls.Add(this.label4);
            this.gbx_inventory.Controls.Add(this.cbxQBasic);
            this.gbx_inventory.Controls.Add(this.label3);
            this.gbx_inventory.Controls.Add(this.btnInvtBasic);
            this.gbx_inventory.Controls.Add(this.btnContinue);
            this.gbx_inventory.Location = new System.Drawing.Point(697, 351);
            this.gbx_inventory.Name = "gbx_inventory";
            this.gbx_inventory.Size = new System.Drawing.Size(305, 127);
            this.gbx_inventory.TabIndex = 18;
            this.gbx_inventory.TabStop = false;
            this.gbx_inventory.Text = "Inventory";
            // 
            // AntStayTime
            // 
            this.AntStayTime.Location = new System.Drawing.Point(271, 93);
            this.AntStayTime.Name = "AntStayTime";
            this.AntStayTime.Size = new System.Drawing.Size(23, 21);
            this.AntStayTime.TabIndex = 16;
            this.AntStayTime.Text = "1";
            this.AntStayTime.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.AntStayTime.Visible = false;
            // 
            // SetAnt
            // 
            this.SetAnt.Location = new System.Drawing.Point(208, 89);
            this.SetAnt.Name = "SetAnt";
            this.SetAnt.Size = new System.Drawing.Size(58, 29);
            this.SetAnt.TabIndex = 15;
            this.SetAnt.Text = "Set Ant";
            this.SetAnt.UseVisualStyleBackColor = true;
            this.SetAnt.Visible = false;
            this.SetAnt.Click += new System.EventHandler(this.SetAnt_Click);
            // 
            // txtSendDelay
            // 
            this.txtSendDelay.Location = new System.Drawing.Point(104, 92);
            this.txtSendDelay.Name = "txtSendDelay";
            this.txtSendDelay.Size = new System.Drawing.Size(47, 21);
            this.txtSendDelay.TabIndex = 14;
            this.txtSendDelay.Text = "60";
            this.txtSendDelay.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // btnStopRD
            // 
            this.btnStopRD.Location = new System.Drawing.Point(208, 55);
            this.btnStopRD.Name = "btnStopRD";
            this.btnStopRD.Size = new System.Drawing.Size(87, 29);
            this.btnStopRD.TabIndex = 13;
            this.btnStopRD.Text = "Stop Read";
            this.btnStopRD.UseVisualStyleBackColor = true;
            this.btnStopRD.Click += new System.EventHandler(this.btn_stop_rd_Click);
            // 
            // label15
            // 
            this.label15.AutoSize = true;
            this.label15.Location = new System.Drawing.Point(153, 63);
            this.label15.Name = "label15";
            this.label15.Size = new System.Drawing.Size(53, 15);
            this.label15.TabIndex = 5;
            this.label15.Text = "0-65535";
            // 
            // txtRDMultiNum
            // 
            this.txtRDMultiNum.Location = new System.Drawing.Point(104, 60);
            this.txtRDMultiNum.Name = "txtRDMultiNum";
            this.txtRDMultiNum.Size = new System.Drawing.Size(47, 21);
            this.txtRDMultiNum.TabIndex = 12;
            this.txtRDMultiNum.Text = "65535";
            this.txtRDMultiNum.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // btnInvtMulti
            // 
            this.btnInvtMulti.Location = new System.Drawing.Point(10, 56);
            this.btnInvtMulti.Name = "btnInvtMulti";
            this.btnInvtMulti.Size = new System.Drawing.Size(87, 29);
            this.btnInvtMulti.TabIndex = 11;
            this.btnInvtMulti.Text = "Read Multi";
            this.btnInvtMulti.UseVisualStyleBackColor = true;
            this.btnInvtMulti.Click += new System.EventHandler(this.btn_invt_multi_Click);
            // 
            // btnSetCW
            // 
            this.btnSetCW.Location = new System.Drawing.Point(208, 21);
            this.btnSetCW.Name = "btnSetCW";
            this.btnSetCW.Size = new System.Drawing.Size(87, 29);
            this.btnSetCW.TabIndex = 3;
            this.btnSetCW.Text = "CW ON";
            this.btnSetCW.UseVisualStyleBackColor = true;
            this.btnSetCW.Click += new System.EventHandler(this.btnSetCW_Click);
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(155, 94);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(25, 15);
            this.label4.TabIndex = 10;
            this.label4.Text = "ms";
            // 
            // cbxQBasic
            // 
            this.cbxQBasic.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbxQBasic.FormattingEnabled = true;
            this.cbxQBasic.Items.AddRange(new object[] {
            "0",
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8"});
            this.cbxQBasic.Location = new System.Drawing.Point(138, 24);
            this.cbxQBasic.Name = "cbxQBasic";
            this.cbxQBasic.Size = new System.Drawing.Size(42, 23);
            this.cbxQBasic.TabIndex = 2;
            this.cbxQBasic.SelectedIndexChanged += new System.EventHandler(this.cbx_q_basic_SelectedIndexChanged);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(106, 28);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(26, 15);
            this.label3.TabIndex = 1;
            this.label3.Text = "Q =";
            // 
            // btnInvtBasic
            // 
            this.btnInvtBasic.Location = new System.Drawing.Point(10, 21);
            this.btnInvtBasic.Name = "btnInvtBasic";
            this.btnInvtBasic.Size = new System.Drawing.Size(87, 29);
            this.btnInvtBasic.TabIndex = 0;
            this.btnInvtBasic.Text = "Read Single";
            this.btnInvtBasic.UseVisualStyleBackColor = true;
            this.btnInvtBasic.Click += new System.EventHandler(this.btn_invt_Click);
            // 
            // dgvEpcBasic
            // 
            this.dgvEpcBasic.AllowUserToAddRows = false;
            this.dgvEpcBasic.AllowUserToDeleteRows = false;
            this.dgvEpcBasic.AllowUserToResizeColumns = false;
            this.dgvEpcBasic.AllowUserToResizeRows = false;
            this.dgvEpcBasic.BackgroundColor = System.Drawing.SystemColors.Control;
            this.dgvEpcBasic.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.dgvEpcBasic.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvEpcBasic.ContextMenuStrip = this.contextMenuStrip1;
            this.dgvEpcBasic.EditMode = System.Windows.Forms.DataGridViewEditMode.EditOnKeystroke;
            this.dgvEpcBasic.Location = new System.Drawing.Point(6, 43);
            this.dgvEpcBasic.Name = "dgvEpcBasic";
            this.dgvEpcBasic.ReadOnly = true;
            this.dgvEpcBasic.RowHeadersVisible = false;
            this.dgvEpcBasic.RowHeadersWidthSizeMode = System.Windows.Forms.DataGridViewRowHeadersWidthSizeMode.DisableResizing;
            this.dgvEpcBasic.RowTemplate.Height = 18;
            this.dgvEpcBasic.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.dgvEpcBasic.Size = new System.Drawing.Size(674, 300);
            this.dgvEpcBasic.TabIndex = 19;
            // 
            // contextMenuStrip1
            // 
            this.contextMenuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.saveAsCsvToolStripMenuItem});
            this.contextMenuStrip1.Name = "contextMenuStrip1";
            this.contextMenuStrip1.Size = new System.Drawing.Size(167, 26);
            // 
            // saveAsCsvToolStripMenuItem
            // 
            this.saveAsCsvToolStripMenuItem.Name = "saveAsCsvToolStripMenuItem";
            this.saveAsCsvToolStripMenuItem.Size = new System.Drawing.Size(166, 22);
            this.saveAsCsvToolStripMenuItem.Text = "Save As csv File";
            this.saveAsCsvToolStripMenuItem.Click += new System.EventHandler(this.saveAsTxtToolStripMenuItem_Click);
            // 
            // gbxEpcTableBasic
            // 
            this.gbxEpcTableBasic.Controls.Add(this.btnChangeBaudrate);
            this.gbxEpcTableBasic.Controls.Add(this.btn_clear_epc1);
            this.gbxEpcTableBasic.Controls.Add(this.dgvEpcBasic);
            this.gbxEpcTableBasic.Font = new System.Drawing.Font("Arial", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.gbxEpcTableBasic.Location = new System.Drawing.Point(0, 6);
            this.gbxEpcTableBasic.Name = "gbxEpcTableBasic";
            this.gbxEpcTableBasic.Size = new System.Drawing.Size(691, 349);
            this.gbxEpcTableBasic.TabIndex = 20;
            this.gbxEpcTableBasic.TabStop = false;
            this.gbxEpcTableBasic.Text = "EPC Table";
            // 
            // btnChangeBaudrate
            // 
            this.btnChangeBaudrate.Location = new System.Drawing.Point(549, 172);
            this.btnChangeBaudrate.Name = "btnChangeBaudrate";
            this.btnChangeBaudrate.Size = new System.Drawing.Size(121, 29);
            this.btnChangeBaudrate.TabIndex = 33;
            this.btnChangeBaudrate.Text = "Change baudrate";
            this.btnChangeBaudrate.UseVisualStyleBackColor = true;
            this.btnChangeBaudrate.Visible = false;
            this.btnChangeBaudrate.Click += new System.EventHandler(this.btnChangeBaudrate_Click);
            // 
            // btn_clear_epc1
            // 
            this.btn_clear_epc1.Location = new System.Drawing.Point(566, 11);
            this.btn_clear_epc1.Name = "btn_clear_epc1";
            this.btn_clear_epc1.Size = new System.Drawing.Size(75, 29);
            this.btn_clear_epc1.TabIndex = 20;
            this.btn_clear_epc1.Text = "Clear";
            this.btn_clear_epc1.UseVisualStyleBackColor = true;
            this.btn_clear_epc1.Click += new System.EventHandler(this.btn_clear_basictable_Click);
            // 
            // ANT8
            // 
            this.ANT8.AutoSize = true;
            this.ANT8.Location = new System.Drawing.Point(710, 595);
            this.ANT8.Name = "ANT8";
            this.ANT8.Size = new System.Drawing.Size(56, 19);
            this.ANT8.TabIndex = 41;
            this.ANT8.Text = "ANT8";
            this.ANT8.UseVisualStyleBackColor = true;
            this.ANT8.Visible = false;
            // 
            // ANT7
            // 
            this.ANT7.AutoSize = true;
            this.ANT7.Location = new System.Drawing.Point(710, 577);
            this.ANT7.Name = "ANT7";
            this.ANT7.Size = new System.Drawing.Size(56, 19);
            this.ANT7.TabIndex = 40;
            this.ANT7.Text = "ANT7";
            this.ANT7.UseVisualStyleBackColor = true;
            this.ANT7.Visible = false;
            // 
            // ANT6
            // 
            this.ANT6.AutoSize = true;
            this.ANT6.Location = new System.Drawing.Point(710, 560);
            this.ANT6.Name = "ANT6";
            this.ANT6.Size = new System.Drawing.Size(56, 19);
            this.ANT6.TabIndex = 39;
            this.ANT6.Text = "ANT6";
            this.ANT6.UseVisualStyleBackColor = true;
            this.ANT6.Visible = false;
            // 
            // ANT5
            // 
            this.ANT5.AutoSize = true;
            this.ANT5.Location = new System.Drawing.Point(710, 543);
            this.ANT5.Name = "ANT5";
            this.ANT5.Size = new System.Drawing.Size(56, 19);
            this.ANT5.TabIndex = 38;
            this.ANT5.Text = "ANT5";
            this.ANT5.UseVisualStyleBackColor = true;
            this.ANT5.Visible = false;
            // 
            // ANT4
            // 
            this.ANT4.AutoSize = true;
            this.ANT4.Location = new System.Drawing.Point(710, 527);
            this.ANT4.Name = "ANT4";
            this.ANT4.Size = new System.Drawing.Size(56, 19);
            this.ANT4.TabIndex = 37;
            this.ANT4.Text = "ANT4";
            this.ANT4.UseVisualStyleBackColor = true;
            this.ANT4.Visible = false;
            // 
            // ANT3
            // 
            this.ANT3.AutoSize = true;
            this.ANT3.Location = new System.Drawing.Point(710, 511);
            this.ANT3.Name = "ANT3";
            this.ANT3.Size = new System.Drawing.Size(56, 19);
            this.ANT3.TabIndex = 36;
            this.ANT3.Text = "ANT3";
            this.ANT3.UseVisualStyleBackColor = true;
            this.ANT3.Visible = false;
            // 
            // ANT2
            // 
            this.ANT2.AutoSize = true;
            this.ANT2.Location = new System.Drawing.Point(710, 495);
            this.ANT2.Name = "ANT2";
            this.ANT2.Size = new System.Drawing.Size(56, 19);
            this.ANT2.TabIndex = 35;
            this.ANT2.Text = "ANT2";
            this.ANT2.UseVisualStyleBackColor = true;
            this.ANT2.Visible = false;
            // 
            // ANT1
            // 
            this.ANT1.AutoSize = true;
            this.ANT1.Location = new System.Drawing.Point(710, 480);
            this.ANT1.Name = "ANT1";
            this.ANT1.Size = new System.Drawing.Size(56, 19);
            this.ANT1.TabIndex = 34;
            this.ANT1.Text = "ANT1";
            this.ANT1.UseVisualStyleBackColor = true;
            this.ANT1.Visible = false;
            // 
            // tabControl1
            // 
            this.tabControl1.Controls.Add(this.tabPage1);
            this.tabControl1.Controls.Add(this.tabPage2);
            //this.tabControl1.Controls.Add(this.tabPage3);
            this.tabControl1.Location = new System.Drawing.Point(0, 0);
            this.tabControl1.Name = "tabControl1";
            this.tabControl1.SelectedIndex = 0;
            this.tabControl1.Size = new System.Drawing.Size(1011, 644);
            this.tabControl1.TabIndex = 21;
            // 
            // tabPage1
            // 
            this.tabPage1.BackColor = System.Drawing.SystemColors.Control;
            this.tabPage1.Controls.Add(this.ANT16);
            this.tabPage1.Controls.Add(this.ANT15);
            this.tabPage1.Controls.Add(this.ANT14);
            this.tabPage1.Controls.Add(this.ANT13);
            this.tabPage1.Controls.Add(this.ANT12);
            this.tabPage1.Controls.Add(this.ANT11);
            this.tabPage1.Controls.Add(this.ANT10);
            this.tabPage1.Controls.Add(this.ANT9);
            this.tabPage1.Controls.Add(this.ANT8);
            this.tabPage1.Controls.Add(this.groupBox4);
            this.tabPage1.Controls.Add(this.ANT7);
            this.tabPage1.Controls.Add(this.pbx_Inv_Indicator);
            this.tabPage1.Controls.Add(this.ANT6);
            this.tabPage1.Controls.Add(this.gbxRfPower);
            this.tabPage1.Controls.Add(this.ANT5);
            this.tabPage1.Controls.Add(this.gbxStatus);
            this.tabPage1.Controls.Add(this.ANT4);
            this.tabPage1.Controls.Add(this.gbxEpcTableBasic);
            this.tabPage1.Controls.Add(this.ANT3);
            this.tabPage1.Controls.Add(this.btnSend);
            this.tabPage1.Controls.Add(this.ANT2);
            this.tabPage1.Controls.Add(this.gbx_setfreq);
            this.tabPage1.Controls.Add(this.ANT1);
            this.tabPage1.Controls.Add(this.gbx_inventory);
            this.tabPage1.Controls.Add(this.txtSend);
            this.tabPage1.Controls.Add(this.gbx_conn);
            this.tabPage1.Controls.Add(this.gbxRxData);
            this.tabPage1.Location = new System.Drawing.Point(4, 24);
            this.tabPage1.Name = "tabPage1";
            this.tabPage1.Padding = new System.Windows.Forms.Padding(3);
            this.tabPage1.Size = new System.Drawing.Size(1003, 616);
            this.tabPage1.TabIndex = 0;
            this.tabPage1.Text = "连接&寻卡 ";
            // 
            // ANT16
            // 
            this.ANT16.AutoSize = true;
            this.ANT16.Location = new System.Drawing.Point(935, 593);
            this.ANT16.Name = "ANT16";
            this.ANT16.Size = new System.Drawing.Size(63, 19);
            this.ANT16.TabIndex = 41;
            this.ANT16.Text = "ANT16";
            this.ANT16.UseVisualStyleBackColor = true;
            this.ANT16.Visible = false;
            // 
            // ANT15
            // 
            this.ANT15.AutoSize = true;
            this.ANT15.Location = new System.Drawing.Point(935, 576);
            this.ANT15.Name = "ANT15";
            this.ANT15.Size = new System.Drawing.Size(63, 19);
            this.ANT15.TabIndex = 41;
            this.ANT15.Text = "ANT15";
            this.ANT15.UseVisualStyleBackColor = true;
            this.ANT15.Visible = false;
            // 
            // ANT14
            // 
            this.ANT14.AutoSize = true;
            this.ANT14.Location = new System.Drawing.Point(935, 559);
            this.ANT14.Name = "ANT14";
            this.ANT14.Size = new System.Drawing.Size(63, 19);
            this.ANT14.TabIndex = 41;
            this.ANT14.Text = "ANT14";
            this.ANT14.UseVisualStyleBackColor = true;
            this.ANT14.Visible = false;
            // 
            // ANT13
            // 
            this.ANT13.AutoSize = true;
            this.ANT13.Location = new System.Drawing.Point(935, 543);
            this.ANT13.Name = "ANT13";
            this.ANT13.Size = new System.Drawing.Size(63, 19);
            this.ANT13.TabIndex = 41;
            this.ANT13.Text = "ANT13";
            this.ANT13.UseVisualStyleBackColor = true;
            this.ANT13.Visible = false;
            // 
            // ANT12
            // 
            this.ANT12.AutoSize = true;
            this.ANT12.Location = new System.Drawing.Point(935, 527);
            this.ANT12.Name = "ANT12";
            this.ANT12.Size = new System.Drawing.Size(63, 19);
            this.ANT12.TabIndex = 41;
            this.ANT12.Text = "ANT12";
            this.ANT12.UseVisualStyleBackColor = true;
            this.ANT12.Visible = false;
            // 
            // ANT11
            // 
            this.ANT11.AutoSize = true;
            this.ANT11.Location = new System.Drawing.Point(935, 511);
            this.ANT11.Name = "ANT11";
            this.ANT11.Size = new System.Drawing.Size(62, 19);
            this.ANT11.TabIndex = 41;
            this.ANT11.Text = "ANT11";
            this.ANT11.UseVisualStyleBackColor = true;
            this.ANT11.Visible = false;
            // 
            // ANT10
            // 
            this.ANT10.AutoSize = true;
            this.ANT10.Location = new System.Drawing.Point(935, 495);
            this.ANT10.Name = "ANT10";
            this.ANT10.Size = new System.Drawing.Size(63, 19);
            this.ANT10.TabIndex = 41;
            this.ANT10.Text = "ANT10";
            this.ANT10.UseVisualStyleBackColor = true;
            this.ANT10.Visible = false;
            // 
            // ANT9
            // 
            this.ANT9.AutoSize = true;
            this.ANT9.Location = new System.Drawing.Point(935, 480);
            this.ANT9.Name = "ANT9";
            this.ANT9.Size = new System.Drawing.Size(56, 19);
            this.ANT9.TabIndex = 41;
            this.ANT9.Text = "ANT9";
            this.ANT9.UseVisualStyleBackColor = true;
            this.ANT9.Visible = false;
            // 
            // groupBox4
            // 
            this.groupBox4.Controls.Add(this.btnSetModuleSleep);
            this.groupBox4.Controls.Add(this.bynSaveConfigToNv);
            this.groupBox4.Controls.Add(this.cbxSaveNvConfig);
            this.groupBox4.Controls.Add(this.cbxMode);
            this.groupBox4.Controls.Add(this.btnSetMode);
            this.groupBox4.Location = new System.Drawing.Point(697, 86);
            this.groupBox4.Name = "groupBox4";
            this.groupBox4.Size = new System.Drawing.Size(303, 94);
            this.groupBox4.TabIndex = 32;
            this.groupBox4.TabStop = false;
            this.groupBox4.Text = "General Setting";
            this.groupBox4.Visible = false;
            // 
            // btnSetModuleSleep
            // 
            this.btnSetModuleSleep.Location = new System.Drawing.Point(226, 57);
            this.btnSetModuleSleep.Name = "btnSetModuleSleep";
            this.btnSetModuleSleep.Size = new System.Drawing.Size(75, 29);
            this.btnSetModuleSleep.TabIndex = 32;
            this.btnSetModuleSleep.Text = "Sleep";
            this.btnSetModuleSleep.UseVisualStyleBackColor = true;
            this.btnSetModuleSleep.Click += new System.EventHandler(this.btnSetModuleSleep_Click);
            // 
            // bynSaveConfigToNv
            // 
            this.bynSaveConfigToNv.Location = new System.Drawing.Point(9, 57);
            this.bynSaveConfigToNv.Name = "bynSaveConfigToNv";
            this.bynSaveConfigToNv.Size = new System.Drawing.Size(96, 29);
            this.bynSaveConfigToNv.TabIndex = 31;
            this.bynSaveConfigToNv.Text = "Save Config";
            this.bynSaveConfigToNv.UseVisualStyleBackColor = true;
            this.bynSaveConfigToNv.Click += new System.EventHandler(this.btnSaveConfigToNv_Click);
            // 
            // cbxSaveNvConfig
            // 
            this.cbxSaveNvConfig.AutoSize = true;
            this.cbxSaveNvConfig.Checked = true;
            this.cbxSaveNvConfig.CheckState = System.Windows.Forms.CheckState.Checked;
            this.cbxSaveNvConfig.Location = new System.Drawing.Point(123, 64);
            this.cbxSaveNvConfig.Name = "cbxSaveNvConfig";
            this.cbxSaveNvConfig.Size = new System.Drawing.Size(104, 19);
            this.cbxSaveNvConfig.TabIndex = 30;
            this.cbxSaveNvConfig.Text = "Config Enable";
            this.cbxSaveNvConfig.UseVisualStyleBackColor = true;
            // 
            // cbxMode
            // 
            this.cbxMode.AutoCompleteCustomSource.AddRange(new string[] {
            "High Sensitivity",
            "Dense Reader"});
            this.cbxMode.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbxMode.FormattingEnabled = true;
            this.cbxMode.Items.AddRange(new object[] {
            "High Sensitivity",
            "Dense Reader"});
            this.cbxMode.Location = new System.Drawing.Point(127, 24);
            this.cbxMode.Name = "cbxMode";
            this.cbxMode.Size = new System.Drawing.Size(112, 23);
            this.cbxMode.TabIndex = 29;
            // 
            // btnSetMode
            // 
            this.btnSetMode.Location = new System.Drawing.Point(10, 20);
            this.btnSetMode.Name = "btnSetMode";
            this.btnSetMode.Size = new System.Drawing.Size(95, 29);
            this.btnSetMode.TabIndex = 28;
            this.btnSetMode.Text = "Set Mode";
            this.btnSetMode.UseVisualStyleBackColor = true;
            this.btnSetMode.Click += new System.EventHandler(this.btnSetMode_Click);
            // 
            // pbx_Inv_Indicator
            // 
            this.pbx_Inv_Indicator.BackColor = System.Drawing.SystemColors.AppWorkspace;
            this.pbx_Inv_Indicator.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("pbx_Inv_Indicator.BackgroundImage")));
            this.pbx_Inv_Indicator.Location = new System.Drawing.Point(789, 481);
            this.pbx_Inv_Indicator.Name = "pbx_Inv_Indicator";
            this.pbx_Inv_Indicator.Size = new System.Drawing.Size(122, 126);
            this.pbx_Inv_Indicator.TabIndex = 27;
            this.pbx_Inv_Indicator.TabStop = false;
            // 
            // gbxRfPower
            // 
            this.gbxRfPower.Controls.Add(this.btnGetPaPower);
            this.gbxRfPower.Controls.Add(this.cbxPaPower);
            this.gbxRfPower.Controls.Add(this.btnSetPaPower);
            this.gbxRfPower.Location = new System.Drawing.Point(697, 299);
            this.gbxRfPower.Name = "gbxRfPower";
            this.gbxRfPower.Size = new System.Drawing.Size(305, 54);
            this.gbxRfPower.TabIndex = 26;
            this.gbxRfPower.TabStop = false;
            this.gbxRfPower.Text = "RF Power Setting";
            // 
            // btnGetPaPower
            // 
            this.btnGetPaPower.Location = new System.Drawing.Point(205, 18);
            this.btnGetPaPower.Name = "btnGetPaPower";
            this.btnGetPaPower.Size = new System.Drawing.Size(89, 29);
            this.btnGetPaPower.TabIndex = 2;
            this.btnGetPaPower.Text = "Get PA Power";
            this.btnGetPaPower.UseVisualStyleBackColor = true;
            this.btnGetPaPower.Click += new System.EventHandler(this.btnGetPaPower_Click);
            // 
            // cbxPaPower
            // 
            this.cbxPaPower.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbxPaPower.FormattingEnabled = true;
            this.cbxPaPower.Items.AddRange(new object[] {
            "20dBm",
            "18.5dBm",
            "17dBm",
            "15.5dBm",
            "14dBm",
            "12.5dBm"});
            this.cbxPaPower.Location = new System.Drawing.Point(103, 22);
            this.cbxPaPower.Name = "cbxPaPower";
            this.cbxPaPower.Size = new System.Drawing.Size(76, 23);
            this.cbxPaPower.TabIndex = 1;
            // 
            // btnSetPaPower
            // 
            this.btnSetPaPower.Location = new System.Drawing.Point(8, 18);
            this.btnSetPaPower.Name = "btnSetPaPower";
            this.btnSetPaPower.Size = new System.Drawing.Size(87, 29);
            this.btnSetPaPower.TabIndex = 0;
            this.btnSetPaPower.Text = "Set PA Power";
            this.btnSetPaPower.UseVisualStyleBackColor = true;
            this.btnSetPaPower.Click += new System.EventHandler(this.btnSetPaPower_Click);
            // 
            // gbxStatus
            // 
            this.gbxStatus.Controls.Add(this.txtFirmwareVersion);
            this.gbxStatus.Controls.Add(this.txtHardwareVersion);
            this.gbxStatus.Controls.Add(this.label37);
            this.gbxStatus.Controls.Add(this.labelHardwareVersion);
            this.gbxStatus.Controls.Add(this.btnClearCnt);
            this.gbxStatus.Controls.Add(this.label17);
            this.gbxStatus.Controls.Add(this.txtCOMRxCnt);
            this.gbxStatus.Controls.Add(this.label16);
            this.gbxStatus.Controls.Add(this.txtCOMTxCnt);
            this.gbxStatus.Location = new System.Drawing.Point(3, 576);
            this.gbxStatus.Name = "gbxStatus";
            this.gbxStatus.Size = new System.Drawing.Size(685, 39);
            this.gbxStatus.TabIndex = 25;
            this.gbxStatus.TabStop = false;
            // 
            // txtFirmwareVersion
            // 
            this.txtFirmwareVersion.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.txtFirmwareVersion.Location = new System.Drawing.Point(358, 17);
            this.txtFirmwareVersion.Name = "txtFirmwareVersion";
            this.txtFirmwareVersion.ReadOnly = true;
            this.txtFirmwareVersion.Size = new System.Drawing.Size(82, 14);
            this.txtFirmwareVersion.TabIndex = 26;
            // 
            // txtHardwareVersion
            // 
            this.txtHardwareVersion.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.txtHardwareVersion.Location = new System.Drawing.Point(535, 17);
            this.txtHardwareVersion.Name = "txtHardwareVersion";
            this.txtHardwareVersion.ReadOnly = true;
            this.txtHardwareVersion.Size = new System.Drawing.Size(126, 14);
            this.txtHardwareVersion.TabIndex = 26;
            // 
            // label37
            // 
            this.label37.AutoSize = true;
            this.label37.Location = new System.Drawing.Point(271, 16);
            this.label37.Name = "label37";
            this.label37.Size = new System.Drawing.Size(82, 15);
            this.label37.TabIndex = 25;
            this.label37.Text = "Firmware Ver:";
            // 
            // labelHardwareVersion
            // 
            this.labelHardwareVersion.AutoSize = true;
            this.labelHardwareVersion.Location = new System.Drawing.Point(446, 16);
            this.labelHardwareVersion.Name = "labelHardwareVersion";
            this.labelHardwareVersion.Size = new System.Drawing.Size(84, 15);
            this.labelHardwareVersion.TabIndex = 25;
            this.labelHardwareVersion.Text = "Hardware Ver:";
            // 
            // label17
            // 
            this.label17.AutoSize = true;
            this.label17.Location = new System.Drawing.Point(187, 15);
            this.label17.Name = "label17";
            this.label17.Size = new System.Drawing.Size(24, 15);
            this.label17.TabIndex = 24;
            this.label17.Text = "TX:";
            // 
            // txtCOMRxCnt
            // 
            this.txtCOMRxCnt.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.txtCOMRxCnt.Location = new System.Drawing.Point(130, 15);
            this.txtCOMRxCnt.Name = "txtCOMRxCnt";
            this.txtCOMRxCnt.ReadOnly = true;
            this.txtCOMRxCnt.Size = new System.Drawing.Size(58, 14);
            this.txtCOMRxCnt.TabIndex = 21;
            this.txtCOMRxCnt.Text = "0";
            // 
            // label16
            // 
            this.label16.AutoSize = true;
            this.label16.Location = new System.Drawing.Point(98, 15);
            this.label16.Name = "label16";
            this.label16.Size = new System.Drawing.Size(26, 15);
            this.label16.TabIndex = 22;
            this.label16.Text = "RX:";
            // 
            // txtCOMTxCnt
            // 
            this.txtCOMTxCnt.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.txtCOMTxCnt.Location = new System.Drawing.Point(213, 16);
            this.txtCOMTxCnt.Name = "txtCOMTxCnt";
            this.txtCOMTxCnt.ReadOnly = true;
            this.txtCOMTxCnt.Size = new System.Drawing.Size(58, 14);
            this.txtCOMTxCnt.TabIndex = 23;
            this.txtCOMTxCnt.Text = "0";
            // 
            // tabPage2
            // 
            this.tabPage2.BackColor = System.Drawing.SystemColors.Control;
            this.tabPage2.Controls.Add(this.groupBoxMonzaCmds);
            this.tabPage2.Controls.Add(this.gbxStatus2);
            this.tabPage2.Controls.Add(this.groupBox5);
            this.tabPage2.Controls.Add(this.inv_mode);
            this.tabPage2.Controls.Add(this.gbxKill);
            this.tabPage2.Controls.Add(this.gBxLock);
            this.tabPage2.Controls.Add(this.gbxSelect);
            this.tabPage2.Controls.Add(this.gbx_comcnt_adv);
            this.tabPage2.Controls.Add(this.gbxAccess);
            this.tabPage2.Controls.Add(this.btnInvtAdv);
            this.tabPage2.Controls.Add(this.gbxEpcTableAdv);
            this.tabPage2.Controls.Add(this.gbxSetQuery);
            this.tabPage2.Location = new System.Drawing.Point(4, 24);
            this.tabPage2.Name = "tabPage2";
            this.tabPage2.Padding = new System.Windows.Forms.Padding(3);
            this.tabPage2.Size = new System.Drawing.Size(1003, 616);
            this.tabPage2.TabIndex = 1;
            this.tabPage2.Text = "内存读写";
            // 
            // groupBoxMonzaCmds
            // 
            this.groupBoxMonzaCmds.Controls.Add(this.label36);
            this.groupBoxMonzaCmds.Controls.Add(this.btnMonzaQTWrite);
            this.groupBoxMonzaCmds.Controls.Add(this.tbxMonzaQTAccessPwd);
            this.groupBoxMonzaCmds.Controls.Add(this.btnMonzaQTRead);
            this.groupBoxMonzaCmds.Controls.Add(this.cbxMonzaQT_MEM);
            this.groupBoxMonzaCmds.Controls.Add(this.cbxMonzaQT_SR);
            this.groupBoxMonzaCmds.Location = new System.Drawing.Point(5, 431);
            this.groupBoxMonzaCmds.Name = "groupBoxMonzaCmds";
            this.groupBoxMonzaCmds.Size = new System.Drawing.Size(471, 46);
            this.groupBoxMonzaCmds.TabIndex = 80;
            this.groupBoxMonzaCmds.TabStop = false;
            this.groupBoxMonzaCmds.Text = "Impinj Monza Tag Commands";
            this.groupBoxMonzaCmds.Visible = false;
            // 
            // label36
            // 
            this.label36.AutoSize = true;
            this.label36.Location = new System.Drawing.Point(6, 20);
            this.label36.Name = "label36";
            this.label36.Size = new System.Drawing.Size(106, 15);
            this.label36.TabIndex = 77;
            this.label36.Text = "Access Password";
            // 
            // btnMonzaQTWrite
            // 
            this.btnMonzaQTWrite.Location = new System.Drawing.Point(294, 12);
            this.btnMonzaQTWrite.Name = "btnMonzaQTWrite";
            this.btnMonzaQTWrite.Size = new System.Drawing.Size(75, 29);
            this.btnMonzaQTWrite.TabIndex = 0;
            this.btnMonzaQTWrite.Text = "QT Write";
            this.btnMonzaQTWrite.UseVisualStyleBackColor = true;
            this.btnMonzaQTWrite.Click += new System.EventHandler(this.btnMonzaQTWrite_Click);
            // 
            // tbxMonzaQTAccessPwd
            // 
            this.tbxMonzaQTAccessPwd.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.tbxMonzaQTAccessPwd.Font = new System.Drawing.Font("Arial", 9F);
            this.tbxMonzaQTAccessPwd.Location = new System.Drawing.Point(115, 17);
            this.tbxMonzaQTAccessPwd.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.tbxMonzaQTAccessPwd.Name = "tbxMonzaQTAccessPwd";
            this.tbxMonzaQTAccessPwd.Size = new System.Drawing.Size(80, 21);
            this.tbxMonzaQTAccessPwd.TabIndex = 76;
            this.tbxMonzaQTAccessPwd.Text = "00 00 00 00";
            this.tbxMonzaQTAccessPwd.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // btnMonzaQTRead
            // 
            this.btnMonzaQTRead.Location = new System.Drawing.Point(203, 12);
            this.btnMonzaQTRead.Name = "btnMonzaQTRead";
            this.btnMonzaQTRead.Size = new System.Drawing.Size(78, 29);
            this.btnMonzaQTRead.TabIndex = 0;
            this.btnMonzaQTRead.Text = "QT Read";
            this.btnMonzaQTRead.UseVisualStyleBackColor = true;
            this.btnMonzaQTRead.Click += new System.EventHandler(this.btnMonzaQTRead_Click);
            // 
            // cbxMonzaQT_MEM
            // 
            this.cbxMonzaQT_MEM.AutoSize = true;
            this.cbxMonzaQT_MEM.Location = new System.Drawing.Point(385, 25);
            this.cbxMonzaQT_MEM.Name = "cbxMonzaQT_MEM";
            this.cbxMonzaQT_MEM.Size = new System.Drawing.Size(75, 19);
            this.cbxMonzaQT_MEM.TabIndex = 71;
            this.cbxMonzaQT_MEM.Text = "QT_MEM";
            this.cbxMonzaQT_MEM.UseVisualStyleBackColor = true;
            // 
            // cbxMonzaQT_SR
            // 
            this.cbxMonzaQT_SR.AutoSize = true;
            this.cbxMonzaQT_SR.Location = new System.Drawing.Point(385, 10);
            this.cbxMonzaQT_SR.Name = "cbxMonzaQT_SR";
            this.cbxMonzaQT_SR.Size = new System.Drawing.Size(66, 19);
            this.cbxMonzaQT_SR.TabIndex = 71;
            this.cbxMonzaQT_SR.Text = "QT_SR";
            this.cbxMonzaQT_SR.UseVisualStyleBackColor = true;
            // 
            // gbxStatus2
            // 
            this.gbxStatus2.Controls.Add(this.rtbxStatus);
            this.gbxStatus2.Controls.Add(this.txtOperateEpc);
            this.gbxStatus2.Controls.Add(this.label27);
            this.gbxStatus2.Controls.Add(this.labelStatus);
            this.gbxStatus2.Location = new System.Drawing.Point(480, 547);
            this.gbxStatus2.Name = "gbxStatus2";
            this.gbxStatus2.Size = new System.Drawing.Size(520, 67);
            this.gbxStatus2.TabIndex = 79;
            this.gbxStatus2.TabStop = false;
            // 
            // rtbxStatus
            // 
            this.rtbxStatus.BackColor = System.Drawing.SystemColors.Control;
            this.rtbxStatus.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.rtbxStatus.Font = new System.Drawing.Font("Arial", 9F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.rtbxStatus.Location = new System.Drawing.Point(76, 44);
            this.rtbxStatus.Name = "rtbxStatus";
            this.rtbxStatus.Size = new System.Drawing.Size(433, 21);
            this.rtbxStatus.TabIndex = 79;
            this.rtbxStatus.Text = "";
            // 
            // txtOperateEpc
            // 
            this.txtOperateEpc.ForeColor = System.Drawing.SystemColors.Highlight;
            this.txtOperateEpc.Location = new System.Drawing.Point(74, 16);
            this.txtOperateEpc.Name = "txtOperateEpc";
            this.txtOperateEpc.ReadOnly = true;
            this.txtOperateEpc.Size = new System.Drawing.Size(435, 21);
            this.txtOperateEpc.TabIndex = 78;
            this.txtOperateEpc.DoubleClick += new System.EventHandler(this.txtOperateEpc_DoubleClick);
            // 
            // label27
            // 
            this.label27.AutoSize = true;
            this.label27.Location = new System.Drawing.Point(9, 20);
            this.label27.Name = "label27";
            this.label27.Size = new System.Drawing.Size(59, 15);
            this.label27.TabIndex = 77;
            this.label27.Text = "PC+EPC:";
            // 
            // labelStatus
            // 
            this.labelStatus.AutoSize = true;
            this.labelStatus.Location = new System.Drawing.Point(9, 46);
            this.labelStatus.Name = "labelStatus";
            this.labelStatus.Size = new System.Drawing.Size(45, 15);
            this.labelStatus.TabIndex = 77;
            this.labelStatus.Text = "Status:";
            // 
            // groupBox5
            // 
            this.groupBox5.Controls.Add(this.label24);
            this.groupBox5.Controls.Add(this.tbxNxpCmdAccessPwd);
            this.groupBox5.Controls.Add(this.cbxReadProtectReset);
            this.groupBox5.Controls.Add(this.btnChangeConfig);
            this.groupBox5.Controls.Add(this.btnReadProtect);
            this.groupBox5.Controls.Add(this.btnChangeEas);
            this.groupBox5.Controls.Add(this.label48);
            this.groupBox5.Controls.Add(this.cbxSetEas);
            this.groupBox5.Controls.Add(this.txtConfigData);
            this.groupBox5.Controls.Add(this.btnEasAlarm);
            this.groupBox5.Location = new System.Drawing.Point(5, 478);
            this.groupBox5.Name = "groupBox5";
            this.groupBox5.Size = new System.Drawing.Size(471, 100);
            this.groupBox5.TabIndex = 76;
            this.groupBox5.TabStop = false;
            this.groupBox5.Text = "NXP Tag Commands";
            this.groupBox5.Visible = false;
            // 
            // label24
            // 
            this.label24.AutoSize = true;
            this.label24.Location = new System.Drawing.Point(4, 31);
            this.label24.Name = "label24";
            this.label24.Size = new System.Drawing.Size(106, 15);
            this.label24.TabIndex = 77;
            this.label24.Text = "Access Password";
            // 
            // tbxNxpCmdAccessPwd
            // 
            this.tbxNxpCmdAccessPwd.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.tbxNxpCmdAccessPwd.Font = new System.Drawing.Font("Arial", 9F);
            this.tbxNxpCmdAccessPwd.Location = new System.Drawing.Point(14, 59);
            this.tbxNxpCmdAccessPwd.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.tbxNxpCmdAccessPwd.Name = "tbxNxpCmdAccessPwd";
            this.tbxNxpCmdAccessPwd.Size = new System.Drawing.Size(80, 21);
            this.tbxNxpCmdAccessPwd.TabIndex = 76;
            this.tbxNxpCmdAccessPwd.Text = "00 00 00 00";
            this.tbxNxpCmdAccessPwd.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // cbxReadProtectReset
            // 
            this.cbxReadProtectReset.AutoSize = true;
            this.cbxReadProtectReset.Location = new System.Drawing.Point(229, 71);
            this.cbxReadProtectReset.Name = "cbxReadProtectReset";
            this.cbxReadProtectReset.Size = new System.Drawing.Size(59, 19);
            this.cbxReadProtectReset.TabIndex = 75;
            this.cbxReadProtectReset.Text = "Reset";
            this.cbxReadProtectReset.UseVisualStyleBackColor = true;
            // 
            // btnChangeConfig
            // 
            this.btnChangeConfig.Location = new System.Drawing.Point(115, 26);
            this.btnChangeConfig.Name = "btnChangeConfig";
            this.btnChangeConfig.Size = new System.Drawing.Size(102, 29);
            this.btnChangeConfig.TabIndex = 70;
            this.btnChangeConfig.Text = "Change Config";
            this.btnChangeConfig.UseVisualStyleBackColor = true;
            this.btnChangeConfig.Click += new System.EventHandler(this.btnChangeConfig_Click);
            // 
            // btnReadProtect
            // 
            this.btnReadProtect.Location = new System.Drawing.Point(115, 65);
            this.btnReadProtect.Name = "btnReadProtect";
            this.btnReadProtect.Size = new System.Drawing.Size(102, 29);
            this.btnReadProtect.TabIndex = 74;
            this.btnReadProtect.Text = "ReadProtect";
            this.btnReadProtect.UseVisualStyleBackColor = true;
            this.btnReadProtect.Click += new System.EventHandler(this.btnReadProtect_Click);
            // 
            // btnChangeEas
            // 
            this.btnChangeEas.Location = new System.Drawing.Point(293, 26);
            this.btnChangeEas.Name = "btnChangeEas";
            this.btnChangeEas.Size = new System.Drawing.Size(95, 29);
            this.btnChangeEas.TabIndex = 70;
            this.btnChangeEas.Text = "Change EAS";
            this.btnChangeEas.UseVisualStyleBackColor = true;
            this.btnChangeEas.Click += new System.EventHandler(this.btnChangeEas_Click);
            // 
            // label48
            // 
            this.label48.AutoSize = true;
            this.label48.Location = new System.Drawing.Point(223, 11);
            this.label48.Name = "label48";
            this.label48.Size = new System.Drawing.Size(76, 15);
            this.label48.TabIndex = 73;
            this.label48.Text = "Config-Word";
            // 
            // cbxSetEas
            // 
            this.cbxSetEas.AutoSize = true;
            this.cbxSetEas.Location = new System.Drawing.Point(396, 31);
            this.cbxSetEas.Name = "cbxSetEas";
            this.cbxSetEas.Size = new System.Drawing.Size(70, 19);
            this.cbxSetEas.TabIndex = 71;
            this.cbxSetEas.Text = "Set EAS";
            this.cbxSetEas.UseVisualStyleBackColor = true;
            // 
            // txtConfigData
            // 
            this.txtConfigData.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.txtConfigData.Location = new System.Drawing.Point(232, 31);
            this.txtConfigData.Name = "txtConfigData";
            this.txtConfigData.Size = new System.Drawing.Size(52, 21);
            this.txtConfigData.TabIndex = 36;
            this.txtConfigData.Text = "00 00";
            this.txtConfigData.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // btnEasAlarm
            // 
            this.btnEasAlarm.Location = new System.Drawing.Point(293, 65);
            this.btnEasAlarm.Name = "btnEasAlarm";
            this.btnEasAlarm.Size = new System.Drawing.Size(95, 29);
            this.btnEasAlarm.TabIndex = 72;
            this.btnEasAlarm.Text = "EAS Alarm";
            this.btnEasAlarm.UseVisualStyleBackColor = true;
            this.btnEasAlarm.Click += new System.EventHandler(this.btnEasAlarm_Click);
            // 
            // inv_mode
            // 
            this.inv_mode.AutoSize = true;
            this.inv_mode.Location = new System.Drawing.Point(269, 389);
            this.inv_mode.Name = "inv_mode";
            this.inv_mode.Size = new System.Drawing.Size(60, 19);
            this.inv_mode.TabIndex = 48;
            this.inv_mode.Text = "Select";
            this.inv_mode.UseVisualStyleBackColor = true;
            this.inv_mode.CheckedChanged += new System.EventHandler(this.inv_mode_CheckedChanged);
            // 
            // gbxKill
            // 
            this.gbxKill.Controls.Add(this.labelKillRFU);
            this.gbxKill.Controls.Add(this.textBoxKillRFU);
            this.gbxKill.Controls.Add(this.label44);
            this.gbxKill.Controls.Add(this.textBoxKillPwd);
            this.gbxKill.Controls.Add(this.buttonKill);
            this.gbxKill.Font = new System.Drawing.Font("Arial", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.gbxKill.Location = new System.Drawing.Point(480, 502);
            this.gbxKill.Name = "gbxKill";
            this.gbxKill.Size = new System.Drawing.Size(518, 46);
            this.gbxKill.TabIndex = 69;
            this.gbxKill.TabStop = false;
            this.gbxKill.Text = "Kill";
            this.gbxKill.Visible = false;
            // 
            // labelKillRFU
            // 
            this.labelKillRFU.AutoSize = true;
            this.labelKillRFU.Location = new System.Drawing.Point(265, 19);
            this.labelKillRFU.Name = "labelKillRFU";
            this.labelKillRFU.Size = new System.Drawing.Size(70, 15);
            this.labelKillRFU.TabIndex = 62;
            this.labelKillRFU.Text = "RFU(3 bits)";
            // 
            // textBoxKillRFU
            // 
            this.textBoxKillRFU.Location = new System.Drawing.Point(343, 16);
            this.textBoxKillRFU.Name = "textBoxKillRFU";
            this.textBoxKillRFU.Size = new System.Drawing.Size(42, 21);
            this.textBoxKillRFU.TabIndex = 61;
            this.textBoxKillRFU.Text = "000";
            this.textBoxKillRFU.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // label44
            // 
            this.label44.AutoSize = true;
            this.label44.Font = new System.Drawing.Font("Arial", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label44.Location = new System.Drawing.Point(13, 18);
            this.label44.Name = "label44";
            this.label44.Size = new System.Drawing.Size(118, 15);
            this.label44.TabIndex = 60;
            this.label44.Text = "Kill Password (HEX)";
            // 
            // textBoxKillPwd
            // 
            this.textBoxKillPwd.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.textBoxKillPwd.Font = new System.Drawing.Font("Arial", 9F);
            this.textBoxKillPwd.Location = new System.Drawing.Point(149, 16);
            this.textBoxKillPwd.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.textBoxKillPwd.Name = "textBoxKillPwd";
            this.textBoxKillPwd.Size = new System.Drawing.Size(81, 21);
            this.textBoxKillPwd.TabIndex = 59;
            this.textBoxKillPwd.Text = "00 00 00 00";
            this.textBoxKillPwd.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // buttonKill
            // 
            this.buttonKill.Location = new System.Drawing.Point(408, 11);
            this.buttonKill.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.buttonKill.Name = "buttonKill";
            this.buttonKill.Size = new System.Drawing.Size(101, 30);
            this.buttonKill.TabIndex = 52;
            this.buttonKill.Text = "Kill";
            this.buttonKill.UseVisualStyleBackColor = true;
            this.buttonKill.Click += new System.EventHandler(this.buttonKill_Click);
            // 
            // gBxLock
            // 
            this.gBxLock.Controls.Add(this.cbxLockUserAction);
            this.gBxLock.Controls.Add(this.cbxLockTIDAction);
            this.gBxLock.Controls.Add(this.cbxLockEPCAction);
            this.gBxLock.Controls.Add(this.cbxLockAccessAction);
            this.gBxLock.Controls.Add(this.cbxLockKillAction);
            this.gBxLock.Controls.Add(this.checkBoxUser);
            this.gBxLock.Controls.Add(this.checkBoxTID);
            this.gBxLock.Controls.Add(this.checkBoxEPC);
            this.gBxLock.Controls.Add(this.checkBoxAccessPwd);
            this.gBxLock.Controls.Add(this.checkBoxKillPwd);
            this.gBxLock.Controls.Add(this.buttonLock);
            this.gBxLock.Controls.Add(this.label42);
            this.gBxLock.Controls.Add(this.textBoxLockAccessPwd);
            this.gBxLock.Font = new System.Drawing.Font("Arial", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.gBxLock.Location = new System.Drawing.Point(480, 387);
            this.gBxLock.Name = "gBxLock";
            this.gBxLock.Size = new System.Drawing.Size(521, 115);
            this.gBxLock.TabIndex = 68;
            this.gBxLock.TabStop = false;
            this.gBxLock.Text = "Lock";
            this.gBxLock.Visible = false;
            // 
            // cbxLockUserAction
            // 
            this.cbxLockUserAction.DisplayMember = "2";
            this.cbxLockUserAction.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbxLockUserAction.Font = new System.Drawing.Font("Arial", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.cbxLockUserAction.FormattingEnabled = true;
            this.cbxLockUserAction.Items.AddRange(new object[] {
            "Open",
            "PWD Lock",
            "Perma Open",
            "Perma Lock"});
            this.cbxLockUserAction.Location = new System.Drawing.Point(271, 83);
            this.cbxLockUserAction.Name = "cbxLockUserAction";
            this.cbxLockUserAction.Size = new System.Drawing.Size(99, 23);
            this.cbxLockUserAction.TabIndex = 36;
            this.cbxLockUserAction.Tag = "";
            // 
            // cbxLockTIDAction
            // 
            this.cbxLockTIDAction.DisplayMember = "2";
            this.cbxLockTIDAction.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbxLockTIDAction.Font = new System.Drawing.Font("Arial", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.cbxLockTIDAction.FormattingEnabled = true;
            this.cbxLockTIDAction.Items.AddRange(new object[] {
            "Open",
            "PWD Lock",
            "Perma Open",
            "Perma Lock"});
            this.cbxLockTIDAction.Location = new System.Drawing.Point(80, 85);
            this.cbxLockTIDAction.Name = "cbxLockTIDAction";
            this.cbxLockTIDAction.Size = new System.Drawing.Size(98, 23);
            this.cbxLockTIDAction.TabIndex = 36;
            this.cbxLockTIDAction.Tag = "";
            // 
            // cbxLockEPCAction
            // 
            this.cbxLockEPCAction.DisplayMember = "2";
            this.cbxLockEPCAction.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbxLockEPCAction.Font = new System.Drawing.Font("Arial", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.cbxLockEPCAction.FormattingEnabled = true;
            this.cbxLockEPCAction.Items.AddRange(new object[] {
            "Open",
            "PWD Lock",
            "Perma Open",
            "Perma Lock"});
            this.cbxLockEPCAction.Location = new System.Drawing.Point(423, 53);
            this.cbxLockEPCAction.Name = "cbxLockEPCAction";
            this.cbxLockEPCAction.Size = new System.Drawing.Size(91, 23);
            this.cbxLockEPCAction.TabIndex = 36;
            this.cbxLockEPCAction.Tag = "";
            // 
            // cbxLockAccessAction
            // 
            this.cbxLockAccessAction.DisplayMember = "2";
            this.cbxLockAccessAction.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbxLockAccessAction.Font = new System.Drawing.Font("Arial", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.cbxLockAccessAction.FormattingEnabled = true;
            this.cbxLockAccessAction.Items.AddRange(new object[] {
            "Open",
            "PWD R/W",
            "Perma Open",
            "Perma NOT R/W"});
            this.cbxLockAccessAction.Location = new System.Drawing.Point(272, 54);
            this.cbxLockAccessAction.Name = "cbxLockAccessAction";
            this.cbxLockAccessAction.Size = new System.Drawing.Size(98, 23);
            this.cbxLockAccessAction.TabIndex = 36;
            this.cbxLockAccessAction.Tag = "";
            // 
            // cbxLockKillAction
            // 
            this.cbxLockKillAction.DisplayMember = "2";
            this.cbxLockKillAction.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbxLockKillAction.Font = new System.Drawing.Font("Arial", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.cbxLockKillAction.FormattingEnabled = true;
            this.cbxLockKillAction.Items.AddRange(new object[] {
            "Open",
            "PWD R/W",
            "Perma Open",
            "Perma NOT R/W"});
            this.cbxLockKillAction.Location = new System.Drawing.Point(79, 53);
            this.cbxLockKillAction.Name = "cbxLockKillAction";
            this.cbxLockKillAction.Size = new System.Drawing.Size(99, 23);
            this.cbxLockKillAction.TabIndex = 36;
            this.cbxLockKillAction.Tag = "";
            // 
            // checkBoxUser
            // 
            this.checkBoxUser.AutoSize = true;
            this.checkBoxUser.Location = new System.Drawing.Point(183, 85);
            this.checkBoxUser.Name = "checkBoxUser";
            this.checkBoxUser.Size = new System.Drawing.Size(53, 19);
            this.checkBoxUser.TabIndex = 86;
            this.checkBoxUser.Text = "User";
            this.checkBoxUser.UseVisualStyleBackColor = true;
            // 
            // checkBoxTID
            // 
            this.checkBoxTID.AutoSize = true;
            this.checkBoxTID.Location = new System.Drawing.Point(11, 85);
            this.checkBoxTID.Name = "checkBoxTID";
            this.checkBoxTID.Size = new System.Drawing.Size(45, 19);
            this.checkBoxTID.TabIndex = 86;
            this.checkBoxTID.Text = "TID";
            this.checkBoxTID.UseVisualStyleBackColor = true;
            // 
            // checkBoxEPC
            // 
            this.checkBoxEPC.AutoSize = true;
            this.checkBoxEPC.Location = new System.Drawing.Point(376, 56);
            this.checkBoxEPC.Name = "checkBoxEPC";
            this.checkBoxEPC.Size = new System.Drawing.Size(51, 19);
            this.checkBoxEPC.TabIndex = 86;
            this.checkBoxEPC.Text = "EPC";
            this.checkBoxEPC.UseVisualStyleBackColor = true;
            // 
            // checkBoxAccessPwd
            // 
            this.checkBoxAccessPwd.AutoSize = true;
            this.checkBoxAccessPwd.Location = new System.Drawing.Point(183, 55);
            this.checkBoxAccessPwd.Name = "checkBoxAccessPwd";
            this.checkBoxAccessPwd.Size = new System.Drawing.Size(93, 19);
            this.checkBoxAccessPwd.TabIndex = 86;
            this.checkBoxAccessPwd.Text = "Access Pwd";
            this.checkBoxAccessPwd.UseVisualStyleBackColor = true;
            // 
            // checkBoxKillPwd
            // 
            this.checkBoxKillPwd.AutoSize = true;
            this.checkBoxKillPwd.Location = new System.Drawing.Point(11, 56);
            this.checkBoxKillPwd.Name = "checkBoxKillPwd";
            this.checkBoxKillPwd.Size = new System.Drawing.Size(70, 19);
            this.checkBoxKillPwd.TabIndex = 86;
            this.checkBoxKillPwd.Text = "Kill Pwd";
            this.checkBoxKillPwd.UseVisualStyleBackColor = true;
            // 
            // buttonLock
            // 
            this.buttonLock.Location = new System.Drawing.Point(272, 15);
            this.buttonLock.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.buttonLock.Name = "buttonLock";
            this.buttonLock.Size = new System.Drawing.Size(101, 30);
            this.buttonLock.TabIndex = 51;
            this.buttonLock.Text = "Lock";
            this.buttonLock.UseVisualStyleBackColor = true;
            this.buttonLock.Click += new System.EventHandler(this.buttonLock_Click);
            // 
            // label42
            // 
            this.label42.AutoSize = true;
            this.label42.Font = new System.Drawing.Font("Arial", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label42.Location = new System.Drawing.Point(7, 24);
            this.label42.Name = "label42";
            this.label42.Size = new System.Drawing.Size(141, 15);
            this.label42.TabIndex = 58;
            this.label42.Text = "Access Password (HEX)";
            // 
            // textBoxLockAccessPwd
            // 
            this.textBoxLockAccessPwd.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.textBoxLockAccessPwd.Font = new System.Drawing.Font("Arial", 9F);
            this.textBoxLockAccessPwd.Location = new System.Drawing.Point(153, 19);
            this.textBoxLockAccessPwd.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.textBoxLockAccessPwd.Name = "textBoxLockAccessPwd";
            this.textBoxLockAccessPwd.Size = new System.Drawing.Size(80, 21);
            this.textBoxLockAccessPwd.TabIndex = 57;
            this.textBoxLockAccessPwd.Text = "00 00 00 00";
            this.textBoxLockAccessPwd.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // gbxSelect
            // 
            this.gbxSelect.BackColor = System.Drawing.SystemColors.Control;
            this.gbxSelect.Controls.Add(this.label34);
            this.gbxSelect.Controls.Add(this.label35);
            this.gbxSelect.Controls.Add(this.txtGetSelLength);
            this.gbxSelect.Controls.Add(this.txtGetSelMask);
            this.gbxSelect.Controls.Add(this.btnGetSelect);
            this.gbxSelect.Controls.Add(this.label33);
            this.gbxSelect.Controls.Add(this.txtSelMask);
            this.gbxSelect.Controls.Add(this.ckxTruncated);
            this.gbxSelect.Controls.Add(this.label32);
            this.gbxSelect.Controls.Add(this.txtSelLength);
            this.gbxSelect.Controls.Add(this.label31);
            this.gbxSelect.Controls.Add(this.txtSelPrt0);
            this.gbxSelect.Controls.Add(this.label30);
            this.gbxSelect.Controls.Add(this.txtSelPrt2);
            this.gbxSelect.Controls.Add(this.label29);
            this.gbxSelect.Controls.Add(this.txtSelPrt1);
            this.gbxSelect.Controls.Add(this.txtSelPrt3);
            this.gbxSelect.Controls.Add(this.label28);
            this.gbxSelect.Controls.Add(this.cbxSelMemBank);
            this.gbxSelect.Controls.Add(this.cbxAction);
            this.gbxSelect.Controls.Add(this.cbxSelTarget);
            this.gbxSelect.Controls.Add(this.btnSetSelect);
            this.gbxSelect.ForeColor = System.Drawing.SystemColors.ControlText;
            this.gbxSelect.Location = new System.Drawing.Point(480, 142);
            this.gbxSelect.Name = "gbxSelect";
            this.gbxSelect.Size = new System.Drawing.Size(521, 158);
            this.gbxSelect.TabIndex = 27;
            this.gbxSelect.TabStop = false;
            this.gbxSelect.Text = "Select Parameter";
            this.gbxSelect.Visible = false;
            // 
            // label34
            // 
            this.label34.AutoSize = true;
            this.label34.Location = new System.Drawing.Point(263, 109);
            this.label34.Name = "label34";
            this.label34.Size = new System.Drawing.Size(36, 15);
            this.label34.TabIndex = 47;
            this.label34.Text = "Mask";
            // 
            // label35
            // 
            this.label35.AutoSize = true;
            this.label35.Location = new System.Drawing.Point(97, 109);
            this.label35.Name = "label35";
            this.label35.Size = new System.Drawing.Size(45, 15);
            this.label35.TabIndex = 46;
            this.label35.Text = "Length";
            // 
            // txtGetSelLength
            // 
            this.txtGetSelLength.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.txtGetSelLength.Location = new System.Drawing.Point(97, 127);
            this.txtGetSelLength.Name = "txtGetSelLength";
            this.txtGetSelLength.ReadOnly = true;
            this.txtGetSelLength.Size = new System.Drawing.Size(40, 21);
            this.txtGetSelLength.TabIndex = 45;
            this.txtGetSelLength.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // txtGetSelMask
            // 
            this.txtGetSelMask.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.txtGetSelMask.Location = new System.Drawing.Point(148, 127);
            this.txtGetSelMask.Name = "txtGetSelMask";
            this.txtGetSelMask.ReadOnly = true;
            this.txtGetSelMask.Size = new System.Drawing.Size(290, 21);
            this.txtGetSelMask.TabIndex = 35;
            this.txtGetSelMask.DoubleClick += new System.EventHandler(this.txtGetSelMask_DoubleClick);
            // 
            // btnGetSelect
            // 
            this.btnGetSelect.Location = new System.Drawing.Point(11, 123);
            this.btnGetSelect.Name = "btnGetSelect";
            this.btnGetSelect.Size = new System.Drawing.Size(75, 29);
            this.btnGetSelect.TabIndex = 44;
            this.btnGetSelect.Text = "Get Select";
            this.btnGetSelect.UseVisualStyleBackColor = true;
            this.btnGetSelect.Click += new System.EventHandler(this.btnGetSelect_Click);
            // 
            // label33
            // 
            this.label33.AutoSize = true;
            this.label33.Location = new System.Drawing.Point(265, 64);
            this.label33.Name = "label33";
            this.label33.Size = new System.Drawing.Size(36, 15);
            this.label33.TabIndex = 43;
            this.label33.Text = "Mask";
            // 
            // txtSelMask
            // 
            this.txtSelMask.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.txtSelMask.Location = new System.Drawing.Point(148, 82);
            this.txtSelMask.Name = "txtSelMask";
            this.txtSelMask.Size = new System.Drawing.Size(290, 21);
            this.txtSelMask.TabIndex = 35;
            this.txtSelMask.Text = "00 00 00 00 00 00 00 00 00 00 00 00";
            this.txtSelMask.DoubleClick += new System.EventHandler(this.txtSelMask_DoubleClick);
            // 
            // ckxTruncated
            // 
            this.ckxTruncated.AutoSize = true;
            this.ckxTruncated.Enabled = false;
            this.ckxTruncated.Location = new System.Drawing.Point(443, 83);
            this.ckxTruncated.Name = "ckxTruncated";
            this.ckxTruncated.Size = new System.Drawing.Size(74, 19);
            this.ckxTruncated.TabIndex = 42;
            this.ckxTruncated.Text = "Truncate";
            this.ckxTruncated.UseVisualStyleBackColor = true;
            this.ckxTruncated.Visible = false;
            this.ckxTruncated.CheckedChanged += new System.EventHandler(this.ckxTruncated_CheckedChanged);
            // 
            // label32
            // 
            this.label32.AutoSize = true;
            this.label32.Location = new System.Drawing.Point(94, 64);
            this.label32.Name = "label32";
            this.label32.Size = new System.Drawing.Size(45, 15);
            this.label32.TabIndex = 41;
            this.label32.Text = "Length";
            // 
            // txtSelLength
            // 
            this.txtSelLength.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.txtSelLength.Location = new System.Drawing.Point(97, 82);
            this.txtSelLength.Name = "txtSelLength";
            this.txtSelLength.Size = new System.Drawing.Size(40, 21);
            this.txtSelLength.TabIndex = 40;
            this.txtSelLength.Text = "60";
            this.txtSelLength.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // label31
            // 
            this.label31.AutoSize = true;
            this.label31.Location = new System.Drawing.Point(360, 17);
            this.label31.Name = "label31";
            this.label31.Size = new System.Drawing.Size(46, 15);
            this.label31.TabIndex = 39;
            this.label31.Text = "Pointer";
            // 
            // txtSelPrt0
            // 
            this.txtSelPrt0.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.txtSelPrt0.Location = new System.Drawing.Point(432, 36);
            this.txtSelPrt0.Name = "txtSelPrt0";
            this.txtSelPrt0.Size = new System.Drawing.Size(40, 21);
            this.txtSelPrt0.TabIndex = 38;
            this.txtSelPrt0.Text = "20";
            this.txtSelPrt0.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // label30
            // 
            this.label30.AutoSize = true;
            this.label30.Location = new System.Drawing.Point(109, 17);
            this.label30.Name = "label30";
            this.label30.Size = new System.Drawing.Size(41, 15);
            this.label30.TabIndex = 38;
            this.label30.Text = "Target";
            // 
            // txtSelPrt2
            // 
            this.txtSelPrt2.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.txtSelPrt2.Location = new System.Drawing.Point(346, 36);
            this.txtSelPrt2.Name = "txtSelPrt2";
            this.txtSelPrt2.Size = new System.Drawing.Size(40, 21);
            this.txtSelPrt2.TabIndex = 37;
            this.txtSelPrt2.Text = "00";
            this.txtSelPrt2.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // label29
            // 
            this.label29.AutoSize = true;
            this.label29.Location = new System.Drawing.Point(177, 17);
            this.label29.Name = "label29";
            this.label29.Size = new System.Drawing.Size(40, 15);
            this.label29.TabIndex = 37;
            this.label29.Text = "Action";
            // 
            // txtSelPrt1
            // 
            this.txtSelPrt1.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.txtSelPrt1.Location = new System.Drawing.Point(389, 36);
            this.txtSelPrt1.Name = "txtSelPrt1";
            this.txtSelPrt1.Size = new System.Drawing.Size(40, 21);
            this.txtSelPrt1.TabIndex = 36;
            this.txtSelPrt1.Text = "00";
            this.txtSelPrt1.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // txtSelPrt3
            // 
            this.txtSelPrt3.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.txtSelPrt3.Location = new System.Drawing.Point(303, 36);
            this.txtSelPrt3.Name = "txtSelPrt3";
            this.txtSelPrt3.Size = new System.Drawing.Size(40, 21);
            this.txtSelPrt3.TabIndex = 35;
            this.txtSelPrt3.Text = "00";
            this.txtSelPrt3.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // label28
            // 
            this.label28.AutoSize = true;
            this.label28.Location = new System.Drawing.Point(226, 17);
            this.label28.Name = "label28";
            this.label28.Size = new System.Drawing.Size(62, 15);
            this.label28.TabIndex = 35;
            this.label28.Text = "MemBank";
            // 
            // cbxSelMemBank
            // 
            this.cbxSelMemBank.DisplayMember = "2";
            this.cbxSelMemBank.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbxSelMemBank.FormattingEnabled = true;
            this.cbxSelMemBank.Items.AddRange(new object[] {
            "RFU",
            "EPC",
            "TID",
            "User"});
            this.cbxSelMemBank.Location = new System.Drawing.Point(229, 35);
            this.cbxSelMemBank.Name = "cbxSelMemBank";
            this.cbxSelMemBank.Size = new System.Drawing.Size(59, 23);
            this.cbxSelMemBank.TabIndex = 35;
            this.cbxSelMemBank.Tag = "";
            // 
            // cbxAction
            // 
            this.cbxAction.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbxAction.FormattingEnabled = true;
            this.cbxAction.Items.AddRange(new object[] {
            "000",
            "001",
            "010",
            "011",
            "100",
            "101",
            "110",
            "111"});
            this.cbxAction.Location = new System.Drawing.Point(173, 35);
            this.cbxAction.Name = "cbxAction";
            this.cbxAction.Size = new System.Drawing.Size(48, 23);
            this.cbxAction.TabIndex = 36;
            // 
            // cbxSelTarget
            // 
            this.cbxSelTarget.DisplayMember = "2";
            this.cbxSelTarget.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbxSelTarget.FormattingEnabled = true;
            this.cbxSelTarget.Items.AddRange(new object[] {
            "S0(000)",
            "S1(001)",
            "S2(010)",
            "S3(011)",
            "SL(100)",
            "RFU(101)",
            "RFU(110)",
            "RFU(111)"});
            this.cbxSelTarget.Location = new System.Drawing.Point(96, 35);
            this.cbxSelTarget.Name = "cbxSelTarget";
            this.cbxSelTarget.Size = new System.Drawing.Size(69, 23);
            this.cbxSelTarget.TabIndex = 35;
            this.cbxSelTarget.Tag = "";
            // 
            // btnSetSelect
            // 
            this.btnSetSelect.Location = new System.Drawing.Point(11, 31);
            this.btnSetSelect.Name = "btnSetSelect";
            this.btnSetSelect.Size = new System.Drawing.Size(75, 29);
            this.btnSetSelect.TabIndex = 35;
            this.btnSetSelect.Text = "Set Select";
            this.btnSetSelect.UseVisualStyleBackColor = true;
            this.btnSetSelect.Click += new System.EventHandler(this.btnSetSelect_Click);
            // 
            // gbx_comcnt_adv
            // 
            this.gbx_comcnt_adv.Controls.Add(this.btnClearCntAdv);
            this.gbx_comcnt_adv.Controls.Add(this.label18);
            this.gbx_comcnt_adv.Controls.Add(this.txtCOMRxCnt_adv);
            this.gbx_comcnt_adv.Controls.Add(this.label19);
            this.gbx_comcnt_adv.Controls.Add(this.txtCOMTxCnt_adv);
            this.gbx_comcnt_adv.Location = new System.Drawing.Point(3, 576);
            this.gbx_comcnt_adv.Name = "gbx_comcnt_adv";
            this.gbx_comcnt_adv.Size = new System.Drawing.Size(473, 39);
            this.gbx_comcnt_adv.TabIndex = 26;
            this.gbx_comcnt_adv.TabStop = false;
            // 
            // btnClearCntAdv
            // 
            this.btnClearCntAdv.Location = new System.Drawing.Point(6, 8);
            this.btnClearCntAdv.Name = "btnClearCntAdv";
            this.btnClearCntAdv.Size = new System.Drawing.Size(87, 29);
            this.btnClearCntAdv.TabIndex = 5;
            this.btnClearCntAdv.Text = "Reset";
            this.btnClearCntAdv.UseVisualStyleBackColor = true;
            this.btnClearCntAdv.Click += new System.EventHandler(this.btn_clear_cnt_adv_Click);
            // 
            // label18
            // 
            this.label18.AutoSize = true;
            this.label18.Location = new System.Drawing.Point(227, 15);
            this.label18.Name = "label18";
            this.label18.Size = new System.Drawing.Size(24, 15);
            this.label18.TabIndex = 24;
            this.label18.Text = "TX:";
            // 
            // txtCOMRxCnt_adv
            // 
            this.txtCOMRxCnt_adv.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.txtCOMRxCnt_adv.Location = new System.Drawing.Point(133, 15);
            this.txtCOMRxCnt_adv.Name = "txtCOMRxCnt_adv";
            this.txtCOMRxCnt_adv.ReadOnly = true;
            this.txtCOMRxCnt_adv.Size = new System.Drawing.Size(88, 14);
            this.txtCOMRxCnt_adv.TabIndex = 21;
            this.txtCOMRxCnt_adv.Text = "0";
            // 
            // label19
            // 
            this.label19.AutoSize = true;
            this.label19.Location = new System.Drawing.Point(101, 15);
            this.label19.Name = "label19";
            this.label19.Size = new System.Drawing.Size(26, 15);
            this.label19.TabIndex = 22;
            this.label19.Text = "RX:";
            // 
            // txtCOMTxCnt_adv
            // 
            this.txtCOMTxCnt_adv.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.txtCOMTxCnt_adv.Location = new System.Drawing.Point(257, 16);
            this.txtCOMTxCnt_adv.Name = "txtCOMTxCnt_adv";
            this.txtCOMTxCnt_adv.ReadOnly = true;
            this.txtCOMTxCnt_adv.Size = new System.Drawing.Size(88, 14);
            this.txtCOMTxCnt_adv.TabIndex = 23;
            this.txtCOMTxCnt_adv.Text = "0";
            // 
            // gbxAccess
            // 
            this.gbxAccess.Controls.Add(this.label5);
            this.gbxAccess.Controls.Add(this.txtWordCnt0);
            this.gbxAccess.Controls.Add(this.txtWordPtr0);
            this.gbxAccess.Controls.Add(this.label26);
            this.gbxAccess.Controls.Add(this.label25);
            this.gbxAccess.Controls.Add(this.txtRwAccPassWord);
            this.gbxAccess.Controls.Add(this.txtInvtRWData);
            this.gbxAccess.Controls.Add(this.btnInvtWrtie);
            this.gbxAccess.Controls.Add(this.label22);
            this.gbxAccess.Controls.Add(this.label21);
            this.gbxAccess.Controls.Add(this.label20);
            this.gbxAccess.Controls.Add(this.cbxMemBank);
            this.gbxAccess.Controls.Add(this.txtWordCnt1);
            this.gbxAccess.Controls.Add(this.txtWordPtr1);
            this.gbxAccess.Controls.Add(this.btn_invtread);
            this.gbxAccess.Location = new System.Drawing.Point(480, 6);
            this.gbxAccess.Name = "gbxAccess";
            this.gbxAccess.Size = new System.Drawing.Size(521, 132);
            this.gbxAccess.TabIndex = 23;
            this.gbxAccess.TabStop = false;
            this.gbxAccess.Text = "Read / Write Tag Memory";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(373, 105);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(146, 15);
            this.label5.TabIndex = 35;
            this.label5.Text = "(Max Length is 32 Words)";
            // 
            // txtWordCnt0
            // 
            this.txtWordCnt0.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.txtWordCnt0.Location = new System.Drawing.Point(229, 40);
            this.txtWordCnt0.Name = "txtWordCnt0";
            this.txtWordCnt0.Size = new System.Drawing.Size(40, 21);
            this.txtWordCnt0.TabIndex = 34;
            this.txtWordCnt0.Text = "08";
            this.txtWordCnt0.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // txtWordPtr0
            // 
            this.txtWordPtr0.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.txtWordPtr0.Location = new System.Drawing.Point(138, 40);
            this.txtWordPtr0.Name = "txtWordPtr0";
            this.txtWordPtr0.Size = new System.Drawing.Size(40, 21);
            this.txtWordPtr0.TabIndex = 33;
            this.txtWordPtr0.Text = "00";
            this.txtWordPtr0.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // label26
            // 
            this.label26.AutoSize = true;
            this.label26.Location = new System.Drawing.Point(289, 22);
            this.label26.Name = "label26";
            this.label26.Size = new System.Drawing.Size(106, 15);
            this.label26.TabIndex = 28;
            this.label26.Text = "Access Password";
            // 
            // label25
            // 
            this.label25.AutoSize = true;
            this.label25.Location = new System.Drawing.Point(49, 69);
            this.label25.Name = "label25";
            this.label25.Size = new System.Drawing.Size(36, 15);
            this.label25.TabIndex = 12;
            this.label25.Text = "Data:";
            // 
            // txtRwAccPassWord
            // 
            this.txtRwAccPassWord.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.txtRwAccPassWord.Location = new System.Drawing.Point(292, 40);
            this.txtRwAccPassWord.Name = "txtRwAccPassWord";
            this.txtRwAccPassWord.Size = new System.Drawing.Size(97, 21);
            this.txtRwAccPassWord.TabIndex = 27;
            this.txtRwAccPassWord.Text = "00 00 00 00";
            this.txtRwAccPassWord.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // txtInvtRWData
            // 
            this.txtInvtRWData.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.txtInvtRWData.Font = new System.Drawing.Font("Lucida Console", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtInvtRWData.Location = new System.Drawing.Point(96, 69);
            this.txtInvtRWData.Name = "txtInvtRWData";
            this.txtInvtRWData.Size = new System.Drawing.Size(415, 19);
            this.txtInvtRWData.TabIndex = 10;
            this.txtInvtRWData.DoubleClick += new System.EventHandler(this.txtInvtReadData_DoubleClick);
            // 
            // btnInvtWrtie
            // 
            this.btnInvtWrtie.Location = new System.Drawing.Point(291, 95);
            this.btnInvtWrtie.Name = "btnInvtWrtie";
            this.btnInvtWrtie.Size = new System.Drawing.Size(75, 29);
            this.btnInvtWrtie.TabIndex = 7;
            this.btnInvtWrtie.Text = "Write";
            this.btnInvtWrtie.UseVisualStyleBackColor = true;
            this.btnInvtWrtie.Click += new System.EventHandler(this.btnInvtWrtie_Click);
            // 
            // label22
            // 
            this.label22.AutoSize = true;
            this.label22.Location = new System.Drawing.Point(21, 22);
            this.label22.Name = "label22";
            this.label22.Size = new System.Drawing.Size(62, 15);
            this.label22.TabIndex = 6;
            this.label22.Text = "MemBank";
            // 
            // label21
            // 
            this.label21.AutoSize = true;
            this.label21.Location = new System.Drawing.Point(185, 22);
            this.label21.Name = "label21";
            this.label21.Size = new System.Drawing.Size(83, 15);
            this.label21.TabIndex = 5;
            this.label21.Text = "Word Counter";
            // 
            // label20
            // 
            this.label20.AutoSize = true;
            this.label20.Location = new System.Drawing.Point(97, 22);
            this.label20.Name = "label20";
            this.label20.Size = new System.Drawing.Size(78, 15);
            this.label20.TabIndex = 4;
            this.label20.Text = "Word Pointer";
            // 
            // cbxMemBank
            // 
            this.cbxMemBank.DisplayMember = "2";
            this.cbxMemBank.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbxMemBank.FormattingEnabled = true;
            this.cbxMemBank.Items.AddRange(new object[] {
            "RFU",
            "EPC",
            "TID",
            "User"});
            this.cbxMemBank.Location = new System.Drawing.Point(23, 39);
            this.cbxMemBank.Name = "cbxMemBank";
            this.cbxMemBank.Size = new System.Drawing.Size(59, 23);
            this.cbxMemBank.TabIndex = 3;
            this.cbxMemBank.Tag = "";
            // 
            // txtWordCnt1
            // 
            this.txtWordCnt1.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.txtWordCnt1.Location = new System.Drawing.Point(185, 40);
            this.txtWordCnt1.Name = "txtWordCnt1";
            this.txtWordCnt1.Size = new System.Drawing.Size(40, 21);
            this.txtWordCnt1.TabIndex = 2;
            this.txtWordCnt1.Text = "00";
            this.txtWordCnt1.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // txtWordPtr1
            // 
            this.txtWordPtr1.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.txtWordPtr1.Location = new System.Drawing.Point(96, 40);
            this.txtWordPtr1.Name = "txtWordPtr1";
            this.txtWordPtr1.Size = new System.Drawing.Size(40, 21);
            this.txtWordPtr1.TabIndex = 1;
            this.txtWordPtr1.Text = "00";
            this.txtWordPtr1.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // btn_invtread
            // 
            this.btn_invtread.Location = new System.Drawing.Point(24, 95);
            this.btn_invtread.Name = "btn_invtread";
            this.btn_invtread.Size = new System.Drawing.Size(75, 29);
            this.btn_invtread.TabIndex = 0;
            this.btn_invtread.Text = "Read";
            this.btn_invtread.UseVisualStyleBackColor = true;
            this.btn_invtread.Click += new System.EventHandler(this.btn_invtread_Click);
            // 
            // btnInvtAdv
            // 
            this.btnInvtAdv.Location = new System.Drawing.Point(167, 370);
            this.btnInvtAdv.Name = "btnInvtAdv";
            this.btnInvtAdv.Size = new System.Drawing.Size(87, 55);
            this.btnInvtAdv.TabIndex = 2;
            this.btnInvtAdv.Text = "Read Single";
            this.btnInvtAdv.UseVisualStyleBackColor = true;
            this.btnInvtAdv.Click += new System.EventHandler(this.btn_invt2_Click);
            // 
            // gbxEpcTableAdv
            // 
            this.gbxEpcTableAdv.Controls.Add(this.btn_clear_epc2);
            this.gbxEpcTableAdv.Controls.Add(this.dgv_epc2);
            this.gbxEpcTableAdv.Location = new System.Drawing.Point(0, 6);
            this.gbxEpcTableAdv.Name = "gbxEpcTableAdv";
            this.gbxEpcTableAdv.Size = new System.Drawing.Size(476, 349);
            this.gbxEpcTableAdv.TabIndex = 0;
            this.gbxEpcTableAdv.TabStop = false;
            this.gbxEpcTableAdv.Text = "EPC Table";
            // 
            // btn_clear_epc2
            // 
            this.btn_clear_epc2.Location = new System.Drawing.Point(347, 11);
            this.btn_clear_epc2.Name = "btn_clear_epc2";
            this.btn_clear_epc2.Size = new System.Drawing.Size(75, 29);
            this.btn_clear_epc2.TabIndex = 21;
            this.btn_clear_epc2.Text = "Clear";
            this.btn_clear_epc2.UseVisualStyleBackColor = true;
            this.btn_clear_epc2.Click += new System.EventHandler(this.btn_clear_epc2_Click);
            // 
            // dgv_epc2
            // 
            this.dgv_epc2.AllowUserToAddRows = false;
            this.dgv_epc2.AllowUserToDeleteRows = false;
            this.dgv_epc2.AllowUserToResizeColumns = false;
            this.dgv_epc2.AllowUserToResizeRows = false;
            this.dgv_epc2.BackgroundColor = System.Drawing.SystemColors.Control;
            this.dgv_epc2.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.dgv_epc2.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgv_epc2.EditMode = System.Windows.Forms.DataGridViewEditMode.EditOnKeystroke;
            this.dgv_epc2.Location = new System.Drawing.Point(6, 43);
            this.dgv_epc2.Name = "dgv_epc2";
            this.dgv_epc2.ReadOnly = true;
            this.dgv_epc2.RowHeadersVisible = false;
            this.dgv_epc2.RowHeadersWidthSizeMode = System.Windows.Forms.DataGridViewRowHeadersWidthSizeMode.DisableResizing;
            this.dgv_epc2.RowTemplate.Height = 18;
            this.dgv_epc2.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.dgv_epc2.Size = new System.Drawing.Size(454, 300);
            this.dgv_epc2.TabIndex = 20;
            this.dgv_epc2.MouseUp += new System.Windows.Forms.MouseEventHandler(this.dataGrid_MouseUp);
            // 
            // gbxSetQuery
            // 
            this.gbxSetQuery.Controls.Add(this.cbxQAdv);
            this.gbxSetQuery.Controls.Add(this.btnGetQuery);
            this.gbxSetQuery.Controls.Add(this.btnSetQuery);
            this.gbxSetQuery.Controls.Add(this.label14);
            this.gbxSetQuery.Controls.Add(this.cbxTarget);
            this.gbxSetQuery.Controls.Add(this.label13);
            this.gbxSetQuery.Controls.Add(this.cbxSession);
            this.gbxSetQuery.Controls.Add(this.label12);
            this.gbxSetQuery.Controls.Add(this.cbxSel);
            this.gbxSetQuery.Controls.Add(this.label11);
            this.gbxSetQuery.Controls.Add(this.cbxTRext);
            this.gbxSetQuery.Controls.Add(this.label10);
            this.gbxSetQuery.Controls.Add(this.label9);
            this.gbxSetQuery.Controls.Add(this.cbxM);
            this.gbxSetQuery.Controls.Add(this.label8);
            this.gbxSetQuery.Controls.Add(this.cbxDR);
            this.gbxSetQuery.Location = new System.Drawing.Point(480, 303);
            this.gbxSetQuery.Name = "gbxSetQuery";
            this.gbxSetQuery.Size = new System.Drawing.Size(521, 85);
            this.gbxSetQuery.TabIndex = 21;
            this.gbxSetQuery.TabStop = false;
            this.gbxSetQuery.Text = "Query Parameter";
            this.gbxSetQuery.Visible = false;
            // 
            // cbxQAdv
            // 
            this.cbxQAdv.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbxQAdv.FormattingEnabled = true;
            this.cbxQAdv.Items.AddRange(new object[] {
            "0",
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8"});
            this.cbxQAdv.Location = new System.Drawing.Point(130, 52);
            this.cbxQAdv.Name = "cbxQAdv";
            this.cbxQAdv.Size = new System.Drawing.Size(48, 23);
            this.cbxQAdv.TabIndex = 17;
            // 
            // btnGetQuery
            // 
            this.btnGetQuery.Location = new System.Drawing.Point(227, 48);
            this.btnGetQuery.Name = "btnGetQuery";
            this.btnGetQuery.Size = new System.Drawing.Size(75, 30);
            this.btnGetQuery.TabIndex = 16;
            this.btnGetQuery.Text = "Get Query";
            this.btnGetQuery.UseVisualStyleBackColor = true;
            this.btnGetQuery.Click += new System.EventHandler(this.btn_getquery_Click);
            // 
            // btnSetQuery
            // 
            this.btnSetQuery.Location = new System.Drawing.Point(337, 48);
            this.btnSetQuery.Name = "btnSetQuery";
            this.btnSetQuery.Size = new System.Drawing.Size(75, 30);
            this.btnSetQuery.TabIndex = 14;
            this.btnSetQuery.Text = "Set Query";
            this.btnSetQuery.UseVisualStyleBackColor = true;
            this.btnSetQuery.Click += new System.EventHandler(this.btn_setquery_Click);
            // 
            // label14
            // 
            this.label14.AutoSize = true;
            this.label14.Location = new System.Drawing.Point(104, 55);
            this.label14.Name = "label14";
            this.label14.Size = new System.Drawing.Size(26, 15);
            this.label14.TabIndex = 12;
            this.label14.Text = "Q =";
            // 
            // cbxTarget
            // 
            this.cbxTarget.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbxTarget.FormattingEnabled = true;
            this.cbxTarget.Items.AddRange(new object[] {
            "A",
            "B"});
            this.cbxTarget.Location = new System.Drawing.Point(52, 52);
            this.cbxTarget.Name = "cbxTarget";
            this.cbxTarget.Size = new System.Drawing.Size(48, 23);
            this.cbxTarget.TabIndex = 11;
            // 
            // label13
            // 
            this.label13.AutoSize = true;
            this.label13.Location = new System.Drawing.Point(2, 55);
            this.label13.Name = "label13";
            this.label13.Size = new System.Drawing.Size(51, 15);
            this.label13.TabIndex = 10;
            this.label13.Text = "Target =";
            // 
            // cbxSession
            // 
            this.cbxSession.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbxSession.FormattingEnabled = true;
            this.cbxSession.Items.AddRange(new object[] {
            "S0",
            "S1",
            "S2",
            "S3"});
            this.cbxSession.Location = new System.Drawing.Point(468, 19);
            this.cbxSession.Name = "cbxSession";
            this.cbxSession.Size = new System.Drawing.Size(48, 23);
            this.cbxSession.TabIndex = 9;
            // 
            // label12
            // 
            this.label12.AutoSize = true;
            this.label12.Location = new System.Drawing.Point(405, 24);
            this.label12.Name = "label12";
            this.label12.Size = new System.Drawing.Size(63, 15);
            this.label12.TabIndex = 8;
            this.label12.Text = "Session =";
            // 
            // cbxSel
            // 
            this.cbxSel.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbxSel.FormattingEnabled = true;
            this.cbxSel.Items.AddRange(new object[] {
            "ALL(00)",
            "ALL(01)",
            "~SL(10)",
            "SL(11)"});
            this.cbxSel.Location = new System.Drawing.Point(338, 19);
            this.cbxSel.Name = "cbxSel";
            this.cbxSel.Size = new System.Drawing.Size(67, 23);
            this.cbxSel.TabIndex = 7;
            // 
            // label11
            // 
            this.label11.AutoSize = true;
            this.label11.Location = new System.Drawing.Point(301, 24);
            this.label11.Name = "label11";
            this.label11.Size = new System.Drawing.Size(35, 15);
            this.label11.TabIndex = 6;
            this.label11.Text = "Sel =";
            // 
            // cbxTRext
            // 
            this.cbxTRext.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbxTRext.Enabled = false;
            this.cbxTRext.FormattingEnabled = true;
            this.cbxTRext.Items.AddRange(new object[] {
            "NoPilot",
            "UsePilot"});
            this.cbxTRext.Location = new System.Drawing.Point(228, 19);
            this.cbxTRext.Name = "cbxTRext";
            this.cbxTRext.Size = new System.Drawing.Size(72, 23);
            this.cbxTRext.TabIndex = 5;
            this.cbxTRext.SelectedIndexChanged += new System.EventHandler(this.cbx_trext_SelectedIndexChanged);
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Location = new System.Drawing.Point(180, 24);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(48, 15);
            this.label10.TabIndex = 4;
            this.label10.Text = "TRext =";
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Location = new System.Drawing.Point(104, 24);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(26, 15);
            this.label9.TabIndex = 3;
            this.label9.Text = "M =";
            // 
            // cbxM
            // 
            this.cbxM.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbxM.Enabled = false;
            this.cbxM.FormattingEnabled = true;
            this.cbxM.Items.AddRange(new object[] {
            "1",
            "2",
            "4",
            "8"});
            this.cbxM.Location = new System.Drawing.Point(130, 19);
            this.cbxM.Name = "cbxM";
            this.cbxM.Size = new System.Drawing.Size(48, 23);
            this.cbxM.TabIndex = 2;
            this.cbxM.SelectedIndexChanged += new System.EventHandler(this.cbx_m_SelectedIndexChanged);
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Location = new System.Drawing.Point(17, 24);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(35, 15);
            this.label8.TabIndex = 1;
            this.label8.Text = "DR =";
            // 
            // cbxDR
            // 
            this.cbxDR.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbxDR.Enabled = false;
            this.cbxDR.FormattingEnabled = true;
            this.cbxDR.Items.AddRange(new object[] {
            "8",
            "64/3"});
            this.cbxDR.Location = new System.Drawing.Point(52, 19);
            this.cbxDR.Name = "cbxDR";
            this.cbxDR.Size = new System.Drawing.Size(48, 23);
            this.cbxDR.TabIndex = 0;
            this.cbxDR.SelectedIndexChanged += new System.EventHandler(this.cbx_dr_SelectedIndexChanged);
            // 
            // tabPage3
            // 
            this.tabPage3.BackColor = System.Drawing.SystemColors.Control;
            this.tabPage3.Controls.Add(this.tv_notice);
            this.tabPage3.Controls.Add(this.btn_commit);
            this.tabPage3.Controls.Add(this.btn_checkout);
            this.tabPage3.Controls.Add(this.lanel_sum);
            this.tabPage3.Controls.Add(this.tv_sum);
            this.tabPage3.Controls.Add(this.btn_card_ready);
            this.tabPage3.Controls.Add(this.button1);
            this.tabPage3.Controls.Add(this.image_lock);
            this.tabPage3.Controls.Add(this.gbxIoControl);
            this.tabPage3.Controls.Add(this.btnScanRssi);
            this.tabPage3.Controls.Add(this.btnScanJammer);
            this.tabPage3.Controls.Add(this.groupBox2);
            this.tabPage3.Controls.Add(this.groupBox1);
            this.tabPage3.Controls.Add(this.hBarChartRssi);
            this.tabPage3.Controls.Add(this.hBarChartJammer);
            this.tabPage3.Location = new System.Drawing.Point(4, 24);
            this.tabPage3.Name = "tabPage3";
            this.tabPage3.Size = new System.Drawing.Size(1003, 616);
            this.tabPage3.TabIndex = 2;
            this.tabPage3.Text = "Test & Modem Setting ";
            // 
            // lanel_sum
            // 
            this.lanel_sum.AutoSize = true;
            this.lanel_sum.Location = new System.Drawing.Point(379, 97);
            this.lanel_sum.Name = "lanel_sum";
            this.lanel_sum.Size = new System.Drawing.Size(31, 15);
            this.lanel_sum.TabIndex = 63;
            this.lanel_sum.Text = "金额";
            this.lanel_sum.Click += new System.EventHandler(this.label38_Click);
            // 
            // tv_sum
            // 
            this.tv_sum.Location = new System.Drawing.Point(470, 89);
            this.tv_sum.Name = "tv_sum";
            this.tv_sum.Size = new System.Drawing.Size(125, 21);
            this.tv_sum.TabIndex = 62;
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(510, 275);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(96, 23);
            this.button1.TabIndex = 61;
            this.button1.Text = "切换显示状态";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // image_lock
            // 
            this.image_lock.Location = new System.Drawing.Point(77, 89);
            this.image_lock.Name = "image_lock";
            this.image_lock.Size = new System.Drawing.Size(201, 137);
            this.image_lock.TabIndex = 60;
            this.image_lock.TabStop = false;
            // 
            // gbxIoControl
            // 
            this.gbxIoControl.Controls.Add(this.cbxIoDircetion);
            this.gbxIoControl.Controls.Add(this.cbxIoLevel);
            this.gbxIoControl.Controls.Add(this.btnSetIoDirection);
            this.gbxIoControl.Controls.Add(this.btnSetIO);
            this.gbxIoControl.Controls.Add(this.btnGetIO);
            this.gbxIoControl.Controls.Add(this.cbxIO);
            this.gbxIoControl.Location = new System.Drawing.Point(721, 218);
            this.gbxIoControl.Name = "gbxIoControl";
            this.gbxIoControl.Size = new System.Drawing.Size(279, 104);
            this.gbxIoControl.TabIndex = 59;
            this.gbxIoControl.TabStop = false;
            this.gbxIoControl.Text = "IO Operation";
            this.gbxIoControl.Visible = false;
            // 
            // cbxIoDircetion
            // 
            this.cbxIoDircetion.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbxIoDircetion.FormattingEnabled = true;
            this.cbxIoDircetion.Items.AddRange(new object[] {
            "Input",
            "Output"});
            this.cbxIoDircetion.Location = new System.Drawing.Point(202, 20);
            this.cbxIoDircetion.Name = "cbxIoDircetion";
            this.cbxIoDircetion.Size = new System.Drawing.Size(60, 23);
            this.cbxIoDircetion.TabIndex = 65;
            this.cbxIoDircetion.Visible = false;
            // 
            // cbxIoLevel
            // 
            this.cbxIoLevel.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbxIoLevel.FormattingEnabled = true;
            this.cbxIoLevel.Items.AddRange(new object[] {
            "Low",
            "High"});
            this.cbxIoLevel.Location = new System.Drawing.Point(202, 59);
            this.cbxIoLevel.Name = "cbxIoLevel";
            this.cbxIoLevel.Size = new System.Drawing.Size(59, 23);
            this.cbxIoLevel.TabIndex = 64;
            // 
            // btnSetIoDirection
            // 
            this.btnSetIoDirection.Location = new System.Drawing.Point(100, 20);
            this.btnSetIoDirection.Name = "btnSetIoDirection";
            this.btnSetIoDirection.Size = new System.Drawing.Size(94, 27);
            this.btnSetIoDirection.TabIndex = 62;
            this.btnSetIoDirection.Text = "Set Direction";
            this.btnSetIoDirection.UseVisualStyleBackColor = true;
            this.btnSetIoDirection.Visible = false;
            this.btnSetIoDirection.Click += new System.EventHandler(this.btnSetIoDirection_Click);
            // 
            // btnSetIO
            // 
            this.btnSetIO.Location = new System.Drawing.Point(100, 57);
            this.btnSetIO.Name = "btnSetIO";
            this.btnSetIO.Size = new System.Drawing.Size(94, 26);
            this.btnSetIO.TabIndex = 60;
            this.btnSetIO.Text = "Set";
            this.btnSetIO.UseVisualStyleBackColor = true;
            this.btnSetIO.Click += new System.EventHandler(this.btnSetIO_Click);
            // 
            // btnGetIO
            // 
            this.btnGetIO.Location = new System.Drawing.Point(20, 56);
            this.btnGetIO.Name = "btnGetIO";
            this.btnGetIO.Size = new System.Drawing.Size(67, 27);
            this.btnGetIO.TabIndex = 59;
            this.btnGetIO.Text = "Get";
            this.btnGetIO.UseVisualStyleBackColor = true;
            this.btnGetIO.Click += new System.EventHandler(this.btnGetIO_Click);
            // 
            // cbxIO
            // 
            this.cbxIO.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbxIO.FormattingEnabled = true;
            this.cbxIO.Items.AddRange(new object[] {
            "IO1",
            "IO2",
            "IO3",
            "IO4"});
            this.cbxIO.Location = new System.Drawing.Point(20, 23);
            this.cbxIO.Name = "cbxIO";
            this.cbxIO.Size = new System.Drawing.Size(67, 23);
            this.cbxIO.TabIndex = 58;
            // 
            // btnScanRssi
            // 
            this.btnScanRssi.Location = new System.Drawing.Point(559, 562);
            this.btnScanRssi.Name = "btnScanRssi";
            this.btnScanRssi.Size = new System.Drawing.Size(101, 31);
            this.btnScanRssi.TabIndex = 57;
            this.btnScanRssi.Text = "Scan RSSI";
            this.btnScanRssi.UseVisualStyleBackColor = true;
            this.btnScanRssi.Visible = false;
            this.btnScanRssi.Click += new System.EventHandler(this.btnScanRssi_Click);
            // 
            // btnScanJammer
            // 
            this.btnScanJammer.Location = new System.Drawing.Point(424, 562);
            this.btnScanJammer.Name = "btnScanJammer";
            this.btnScanJammer.Size = new System.Drawing.Size(101, 31);
            this.btnScanJammer.TabIndex = 47;
            this.btnScanJammer.Text = "Scan Jammer";
            this.btnScanJammer.UseVisualStyleBackColor = true;
            this.btnScanJammer.Visible = false;
            this.btnScanJammer.Click += new System.EventHandler(this.btnScanJammer_Click);
            // 
            // groupBox2
            // 
            this.groupBox2.Controls.Add(this.tbxCoupling);
            this.groupBox2.Controls.Add(this.label45);
            this.groupBox2.Controls.Add(this.tbxAntennaGain);
            this.groupBox2.Controls.Add(this.label43);
            this.groupBox2.Location = new System.Drawing.Point(721, 140);
            this.groupBox2.Name = "groupBox2";
            this.groupBox2.Size = new System.Drawing.Size(279, 77);
            this.groupBox2.TabIndex = 45;
            this.groupBox2.TabStop = false;
            this.groupBox2.Text = "RSSI Parameter";
            this.groupBox2.Visible = false;
            // 
            // tbxCoupling
            // 
            this.tbxCoupling.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.tbxCoupling.Location = new System.Drawing.Point(174, 46);
            this.tbxCoupling.Name = "tbxCoupling";
            this.tbxCoupling.Size = new System.Drawing.Size(51, 21);
            this.tbxCoupling.TabIndex = 46;
            this.tbxCoupling.Text = "-27";
            this.tbxCoupling.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // label45
            // 
            this.label45.AutoSize = true;
            this.label45.Location = new System.Drawing.Point(143, 28);
            this.label45.Name = "label45";
            this.label45.Size = new System.Drawing.Size(120, 15);
            this.label45.TabIndex = 47;
            this.label45.Text = "Coupling of Coupler ";
            // 
            // tbxAntennaGain
            // 
            this.tbxAntennaGain.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.tbxAntennaGain.Location = new System.Drawing.Point(33, 46);
            this.tbxAntennaGain.Name = "tbxAntennaGain";
            this.tbxAntennaGain.Size = new System.Drawing.Size(54, 21);
            this.tbxAntennaGain.TabIndex = 44;
            this.tbxAntennaGain.Text = "1";
            this.tbxAntennaGain.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // label43
            // 
            this.label43.AutoSize = true;
            this.label43.Location = new System.Drawing.Point(17, 28);
            this.label43.Name = "label43";
            this.label43.Size = new System.Drawing.Size(81, 15);
            this.label43.TabIndex = 45;
            this.label43.Text = "Antenna Gain";
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.tbxSignalThreshold);
            this.groupBox1.Controls.Add(this.label23);
            this.groupBox1.Controls.Add(this.btnSetModemPara);
            this.groupBox1.Controls.Add(this.label7);
            this.groupBox1.Controls.Add(this.cbxMixerGain);
            this.groupBox1.Controls.Add(this.label6);
            this.groupBox1.Controls.Add(this.cbxIFAmpGain);
            this.groupBox1.Controls.Add(this.btnGetModemPara);
            this.groupBox1.Location = new System.Drawing.Point(721, 25);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(279, 115);
            this.groupBox1.TabIndex = 44;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Modem Settings";
            this.groupBox1.Visible = false;
            // 
            // tbxSignalThreshold
            // 
            this.tbxSignalThreshold.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.tbxSignalThreshold.Location = new System.Drawing.Point(196, 39);
            this.tbxSignalThreshold.Name = "tbxSignalThreshold";
            this.tbxSignalThreshold.Size = new System.Drawing.Size(46, 21);
            this.tbxSignalThreshold.TabIndex = 39;
            this.tbxSignalThreshold.Text = "01B0";
            this.tbxSignalThreshold.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // label23
            // 
            this.label23.AutoSize = true;
            this.label23.Location = new System.Drawing.Point(189, 20);
            this.label23.Name = "label23";
            this.label23.Size = new System.Drawing.Size(63, 15);
            this.label23.TabIndex = 43;
            this.label23.Text = "Threshold";
            // 
            // btnSetModemPara
            // 
            this.btnSetModemPara.Location = new System.Drawing.Point(20, 76);
            this.btnSetModemPara.Name = "btnSetModemPara";
            this.btnSetModemPara.Size = new System.Drawing.Size(87, 29);
            this.btnSetModemPara.TabIndex = 36;
            this.btnSetModemPara.Text = "Set Modem";
            this.btnSetModemPara.UseVisualStyleBackColor = true;
            this.btnSetModemPara.Click += new System.EventHandler(this.btnSetModemPara_Click);
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(106, 20);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(73, 15);
            this.label7.TabIndex = 42;
            this.label7.Text = "IF Amp Gain";
            // 
            // cbxMixerGain
            // 
            this.cbxMixerGain.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbxMixerGain.FormattingEnabled = true;
            this.cbxMixerGain.Items.AddRange(new object[] {
            "0dB",
            "3dB",
            "6dB",
            "9dB",
            "12dB",
            "15dB",
            "16dB"});
            this.cbxMixerGain.Location = new System.Drawing.Point(17, 36);
            this.cbxMixerGain.Name = "cbxMixerGain";
            this.cbxMixerGain.Size = new System.Drawing.Size(65, 23);
            this.cbxMixerGain.TabIndex = 37;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(17, 20);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(64, 15);
            this.label6.TabIndex = 41;
            this.label6.Text = "Mixer Gain";
            // 
            // cbxIFAmpGain
            // 
            this.cbxIFAmpGain.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbxIFAmpGain.FormattingEnabled = true;
            this.cbxIFAmpGain.Items.AddRange(new object[] {
            "12dB",
            "18dB",
            "21dB",
            "24dB",
            "27dB",
            "30dB",
            "36dB",
            "40dB"});
            this.cbxIFAmpGain.Location = new System.Drawing.Point(114, 36);
            this.cbxIFAmpGain.Name = "cbxIFAmpGain";
            this.cbxIFAmpGain.Size = new System.Drawing.Size(59, 23);
            this.cbxIFAmpGain.TabIndex = 38;
            // 
            // btnGetModemPara
            // 
            this.btnGetModemPara.Location = new System.Drawing.Point(166, 76);
            this.btnGetModemPara.Name = "btnGetModemPara";
            this.btnGetModemPara.Size = new System.Drawing.Size(86, 29);
            this.btnGetModemPara.TabIndex = 40;
            this.btnGetModemPara.Text = "Get Modem";
            this.btnGetModemPara.UseVisualStyleBackColor = true;
            this.btnGetModemPara.Click += new System.EventHandler(this.btnGetModemPara_Click);
            // 
            // hBarChartRssi
            // 
            this.hBarChartRssi.Background.GradientColor1 = System.Drawing.Color.White;
            this.hBarChartRssi.Background.GradientColor2 = System.Drawing.Color.White;
            this.hBarChartRssi.Background.PaintingMode = BarChart.CBackgroundProperty.PaintingModes.SolidColor;
            this.hBarChartRssi.Background.SolidColor = System.Drawing.Color.White;
            this.hBarChartRssi.BackgroundImageLayout = System.Windows.Forms.ImageLayout.None;
            this.hBarChartRssi.BarsGap = 1;
            this.hBarChartRssi.BarWidth = 11;
            this.hBarChartRssi.Border.BoundRect = ((System.Drawing.RectangleF)(resources.GetObject("resource.BoundRect")));
            this.hBarChartRssi.Border.Color = System.Drawing.Color.White;
            this.hBarChartRssi.Border.Visible = true;
            this.hBarChartRssi.Border.Width = 1;
            this.hBarChartRssi.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.hBarChartRssi.Description.Color = System.Drawing.Color.Black;
            this.hBarChartRssi.Description.Font = new System.Drawing.Font("Tahoma", 3.2F, System.Drawing.FontStyle.Bold);
            this.hBarChartRssi.Description.FontDefaultSize = 14F;
            this.hBarChartRssi.Description.Text = "";
            this.hBarChartRssi.Description.Visible = false;
            this.hBarChartRssi.Font = new System.Drawing.Font("Arial", 3.75F);
            this.hBarChartRssi.Items.DefaultWidth = 0;
            this.hBarChartRssi.Items.DrawingMode = BarChart.HBarItems.DrawingModes.Solid;
            this.hBarChartRssi.Items.Maximum = 40D;
            this.hBarChartRssi.Items.Minimum = 0D;
            this.hBarChartRssi.Items.ShouldReCalculate = false;
            this.hBarChartRssi.Label.Color = System.Drawing.Color.Black;
            this.hBarChartRssi.Label.Font = new System.Drawing.Font("Arial", 100.4583F, System.Drawing.FontStyle.Bold);
            this.hBarChartRssi.Label.FontDefaultSize = 100.4583F;
            this.hBarChartRssi.Label.Visible = true;
            this.hBarChartRssi.Location = new System.Drawing.Point(593, 503);
            this.hBarChartRssi.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.hBarChartRssi.Name = "hBarChartRssi";
            this.hBarChartRssi.Shadow.ColorInner = System.Drawing.Color.FromArgb(((int)(((byte)(100)))), ((int)(((byte)(0)))), ((int)(((byte)(0)))), ((int)(((byte)(0)))));
            this.hBarChartRssi.Shadow.ColorOuter = System.Drawing.Color.FromArgb(((int)(((byte)(100)))), ((int)(((byte)(0)))), ((int)(((byte)(0)))), ((int)(((byte)(0)))));
            this.hBarChartRssi.Shadow.Mode = BarChart.CShadowProperty.Modes.None;
            this.hBarChartRssi.Shadow.WidthInner = 5;
            this.hBarChartRssi.Shadow.WidthOuter = 5;
            this.hBarChartRssi.Size = new System.Drawing.Size(112, 52);
            this.hBarChartRssi.SizingMode = BarChart.HBarChart.BarSizingMode.AutoScale;
            this.hBarChartRssi.TabIndex = 54;
            this.hBarChartRssi.Values.Color = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(255)))), ((int)(((byte)(255)))));
            this.hBarChartRssi.Values.Font = new System.Drawing.Font("Tahoma", 100.4583F);
            this.hBarChartRssi.Values.FontDefaultSize = 7F;
            this.hBarChartRssi.Values.Mode = BarChart.CValueProperty.ValueMode.Digit;
            this.hBarChartRssi.Values.Visible = false;
            this.hBarChartRssi.Visible = false;
            // 
            // hBarChartJammer
            // 
            this.hBarChartJammer.Background.GradientColor1 = System.Drawing.Color.White;
            this.hBarChartJammer.Background.GradientColor2 = System.Drawing.Color.White;
            this.hBarChartJammer.Background.PaintingMode = BarChart.CBackgroundProperty.PaintingModes.SolidColor;
            this.hBarChartJammer.Background.SolidColor = System.Drawing.Color.White;
            this.hBarChartJammer.BackgroundImageLayout = System.Windows.Forms.ImageLayout.None;
            this.hBarChartJammer.BarsGap = 1;
            this.hBarChartJammer.BarWidth = 11;
            this.hBarChartJammer.Border.BoundRect = ((System.Drawing.RectangleF)(resources.GetObject("resource.BoundRect1")));
            this.hBarChartJammer.Border.Color = System.Drawing.Color.White;
            this.hBarChartJammer.Border.Visible = true;
            this.hBarChartJammer.Border.Width = 1;
            this.hBarChartJammer.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.hBarChartJammer.Cursor = System.Windows.Forms.Cursors.Default;
            this.hBarChartJammer.Description.Color = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(255)))), ((int)(((byte)(255)))));
            this.hBarChartJammer.Description.Font = new System.Drawing.Font("Tahoma", 3.733333F, System.Drawing.FontStyle.Bold);
            this.hBarChartJammer.Description.FontDefaultSize = 14F;
            this.hBarChartJammer.Description.Text = "Jammer";
            this.hBarChartJammer.Description.Visible = false;
            this.hBarChartJammer.Font = new System.Drawing.Font("Arial", 3.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.hBarChartJammer.Items.DefaultWidth = 0;
            this.hBarChartJammer.Items.DrawingMode = BarChart.HBarItems.DrawingModes.Solid;
            this.hBarChartJammer.Items.Maximum = 40D;
            this.hBarChartJammer.Items.Minimum = 0D;
            this.hBarChartJammer.Items.ShouldReCalculate = false;
            this.hBarChartJammer.Label.Color = System.Drawing.Color.Black;
            this.hBarChartJammer.Label.Font = new System.Drawing.Font("Arial", 100.4583F, System.Drawing.FontStyle.Bold);
            this.hBarChartJammer.Label.FontDefaultSize = 3.75F;
            this.hBarChartJammer.Label.Visible = true;
            this.hBarChartJammer.Location = new System.Drawing.Point(593, 422);
            this.hBarChartJammer.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.hBarChartJammer.Name = "hBarChartJammer";
            this.hBarChartJammer.Shadow.ColorInner = System.Drawing.Color.FromArgb(((int)(((byte)(100)))), ((int)(((byte)(0)))), ((int)(((byte)(0)))), ((int)(((byte)(0)))));
            this.hBarChartJammer.Shadow.ColorOuter = System.Drawing.Color.FromArgb(((int)(((byte)(100)))), ((int)(((byte)(0)))), ((int)(((byte)(0)))), ((int)(((byte)(0)))));
            this.hBarChartJammer.Shadow.Mode = BarChart.CShadowProperty.Modes.None;
            this.hBarChartJammer.Shadow.WidthInner = 5;
            this.hBarChartJammer.Shadow.WidthOuter = 5;
            this.hBarChartJammer.Size = new System.Drawing.Size(112, 60);
            this.hBarChartJammer.SizingMode = BarChart.HBarChart.BarSizingMode.AutoScale;
            this.hBarChartJammer.TabIndex = 53;
            this.hBarChartJammer.Values.Color = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(255)))), ((int)(((byte)(255)))));
            this.hBarChartJammer.Values.Font = new System.Drawing.Font("Tahoma", 100.4583F);
            this.hBarChartJammer.Values.FontDefaultSize = 7F;
            this.hBarChartJammer.Values.Mode = BarChart.CValueProperty.ValueMode.Digit;
            this.hBarChartJammer.Values.Visible = false;
            this.hBarChartJammer.Visible = false;
            // 
            // gbxRdIntrgtMem
            // 
            this.gbxRdIntrgtMem.Location = new System.Drawing.Point(0, 0);
            this.gbxRdIntrgtMem.Name = "gbxRdIntrgtMem";
            this.gbxRdIntrgtMem.Size = new System.Drawing.Size(200, 100);
            this.gbxRdIntrgtMem.TabIndex = 0;
            this.gbxRdIntrgtMem.TabStop = false;
            // 
            // timerCheckReader
            // 
            this.timerCheckReader.Interval = 1000;
            this.timerCheckReader.Tick += new System.EventHandler(this.timerCheckReader_Tick);
            // 
            // tmrCheckEpc
            // 
            this.tmrCheckEpc.Interval = 300;
            this.tmrCheckEpc.Tick += new System.EventHandler(this.tmrCheckEpc_Tick);
            // 
            // btn_checkout
            // 
            this.btn_checkout.Location = new System.Drawing.Point(382, 159);
            this.btn_checkout.Name = "btn_checkout";
            this.btn_checkout.Size = new System.Drawing.Size(75, 23);
            this.btn_checkout.TabIndex = 64;
            this.btn_checkout.Text = "查询";
            this.btn_checkout.UseVisualStyleBackColor = true;
            this.btn_checkout.Click += new System.EventHandler(this.btn_checkout_Click);
            // 
            // btn_commit
            // 
            this.btn_commit.Location = new System.Drawing.Point(520, 159);
            this.btn_commit.Name = "btn_commit";
            this.btn_commit.Size = new System.Drawing.Size(75, 23);
            this.btn_commit.TabIndex = 64;
            this.btn_commit.Text = "充值";
            this.btn_commit.UseVisualStyleBackColor = true;
            this.btn_commit.Click += new System.EventHandler(this.btn_commit_Click);
            // 
            // tv_notice
            // 
            this.tv_notice.AutoSize = true;
            this.tv_notice.BackColor = System.Drawing.SystemColors.Info;
            this.tv_notice.Font = new System.Drawing.Font("Arial", 10.5F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.tv_notice.Location = new System.Drawing.Point(74, 443);
            this.tv_notice.Name = "tv_notice";
            this.tv_notice.Size = new System.Drawing.Size(282, 112);
            this.tv_notice.TabIndex = 65;
            this.tv_notice.Text = "步骤：\r\n1、将RFID卡片放置到读卡器上\r\n2、点击卡片放置就绪按钮即可看到实验现象\r\n\r\n\r\n\r\n注意：充值金额为1-255之间";
            this.tv_notice.Click += new System.EventHandler(this.tv_notice_Click);
            // 
            // btn_card_ready
            // 
            this.btn_card_ready.Location = new System.Drawing.Point(371, 274);
            this.btn_card_ready.Name = "btn_card_ready";
            this.btn_card_ready.Size = new System.Drawing.Size(96, 23);
            this.btn_card_ready.TabIndex = 61;
            this.btn_card_ready.Text = "卡片放置就绪";
            this.btn_card_ready.UseVisualStyleBackColor = true;
            this.btn_card_ready.Click += new System.EventHandler(this.button1_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(96F, 96F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Dpi;
            this.ClientSize = new System.Drawing.Size(1008, 642);
            this.Controls.Add(this.tabControl1);
            this.Font = new System.Drawing.Font("Arial", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.Fixed3D;
            this.MaximizeBox = false;
            this.Name = "Form1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "RFD900MDemo ";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.gbx_conn.ResumeLayout(false);
            this.gbx_conn.PerformLayout();
            this.gbx_setfreq.ResumeLayout(false);
            this.gbx_setfreq.PerformLayout();
            this.gbxRxData.ResumeLayout(false);
            this.gbxRxData.PerformLayout();
            this.gbx_inventory.ResumeLayout(false);
            this.gbx_inventory.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dgvEpcBasic)).EndInit();
            this.contextMenuStrip1.ResumeLayout(false);
            this.gbxEpcTableBasic.ResumeLayout(false);
            this.tabControl1.ResumeLayout(false);
            this.tabPage1.ResumeLayout(false);
            this.tabPage1.PerformLayout();
            this.groupBox4.ResumeLayout(false);
            this.groupBox4.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pbx_Inv_Indicator)).EndInit();
            this.gbxRfPower.ResumeLayout(false);
            this.gbxStatus.ResumeLayout(false);
            this.gbxStatus.PerformLayout();
            this.tabPage2.ResumeLayout(false);
            this.tabPage2.PerformLayout();
            this.groupBoxMonzaCmds.ResumeLayout(false);
            this.groupBoxMonzaCmds.PerformLayout();
            this.gbxStatus2.ResumeLayout(false);
            this.gbxStatus2.PerformLayout();
            this.groupBox5.ResumeLayout(false);
            this.groupBox5.PerformLayout();
            this.gbxKill.ResumeLayout(false);
            this.gbxKill.PerformLayout();
            this.gBxLock.ResumeLayout(false);
            this.gBxLock.PerformLayout();
            this.gbxSelect.ResumeLayout(false);
            this.gbxSelect.PerformLayout();
            this.gbx_comcnt_adv.ResumeLayout(false);
            this.gbx_comcnt_adv.PerformLayout();
            this.gbxAccess.ResumeLayout(false);
            this.gbxAccess.PerformLayout();
            this.gbxEpcTableAdv.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.dgv_epc2)).EndInit();
            this.gbxSetQuery.ResumeLayout(false);
            this.gbxSetQuery.PerformLayout();
            this.tabPage3.ResumeLayout(false);
            this.tabPage3.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.image_lock)).EndInit();
            this.gbxIoControl.ResumeLayout(false);
            this.groupBox2.ResumeLayout(false);
            this.groupBox2.PerformLayout();
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.GroupBox gbx_conn;
        private System.Windows.Forms.Button btnConn;
        private System.Windows.Forms.ComboBox cbxBaudRate;
        private System.Windows.Forms.ComboBox cbxPort;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.ToolTip toolTip1;
        private System.Windows.Forms.TextBox txtReceive;
        private System.Windows.Forms.TextBox txtSend;
        private System.Windows.Forms.Button btn_clear_rx;
        private System.Windows.Forms.Button btnClearCnt;
        private System.Windows.Forms.Button btnSend;
        private System.Windows.Forms.Timer timerAutoSend;
        private System.Windows.Forms.Button btnContinue;
        private System.Windows.Forms.TextBox txtFWName;
        private System.Windows.Forms.GroupBox gbx_setfreq;
        private System.Windows.Forms.Button btnSetFreq;
        private System.Windows.Forms.ComboBox cbxRegion;
        private System.Windows.Forms.ComboBox cbxChannel;
        private System.Windows.Forms.GroupBox gbxRxData;
        private System.Windows.Forms.GroupBox gbx_inventory;
        private System.Windows.Forms.Button btnInvtBasic;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.ComboBox cbxQBasic;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.DataGridView dgvEpcBasic;
        private System.Windows.Forms.GroupBox gbxEpcTableBasic;
        private System.Windows.Forms.Button btn_clear_epc1;
        private System.Windows.Forms.CheckBox cbxAutoClear;
        private System.Windows.Forms.Button btnSetCW;
        private System.Windows.Forms.CheckBox cbxRxVisable;
        private System.Windows.Forms.TabControl tabControl1;
        private System.Windows.Forms.TabPage tabPage1;
        private System.Windows.Forms.TabPage tabPage2;
        private System.Windows.Forms.GroupBox gbxEpcTableAdv;
        private System.Windows.Forms.DataGridView dgv_epc2;
        private System.Windows.Forms.Button btn_clear_epc2;
        private System.Windows.Forms.Button btnInvtAdv;
        private System.Windows.Forms.GroupBox gbxSetQuery;
        private System.Windows.Forms.ComboBox cbxDR;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.ComboBox cbxM;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.ComboBox cbxTRext;
        private System.Windows.Forms.Label label11;
        private System.Windows.Forms.ComboBox cbxSel;
        private System.Windows.Forms.Label label12;
        private System.Windows.Forms.ComboBox cbxSession;
        private System.Windows.Forms.GroupBox gbxRdIntrgtMem;
        private System.Windows.Forms.Label label13;
        private System.Windows.Forms.ComboBox cbxTarget;
        private System.Windows.Forms.Label label14;
        private System.Windows.Forms.Button btnSetQuery;
        private System.Windows.Forms.Button btnGetQuery;
        private System.Windows.Forms.ComboBox cbxQAdv;
        private System.Windows.Forms.Button btnInvtMulti;
        private System.Windows.Forms.TextBox txtRDMultiNum;
        private System.Windows.Forms.Label label15;
        private System.Windows.Forms.Button btnStopRD;
        private System.Windows.Forms.TextBox txtCOMRxCnt;
        private System.Windows.Forms.Label label16;
        private System.Windows.Forms.Label label17;
        private System.Windows.Forms.TextBox txtCOMTxCnt;
        private System.Windows.Forms.GroupBox gbxStatus;
        private System.Windows.Forms.GroupBox gbxAccess;
        private System.Windows.Forms.GroupBox gbx_comcnt_adv;
        private System.Windows.Forms.Button btnClearCntAdv;
        private System.Windows.Forms.Label label18;
        private System.Windows.Forms.TextBox txtCOMRxCnt_adv;
        private System.Windows.Forms.Label label19;
        private System.Windows.Forms.TextBox txtCOMTxCnt_adv;
        private System.Windows.Forms.Button btn_invtread;
        private System.Windows.Forms.TextBox txtWordPtr1;
        private System.Windows.Forms.TextBox txtWordCnt1;
        private System.Windows.Forms.ComboBox cbxMemBank;
        private System.Windows.Forms.Label label20;
        private System.Windows.Forms.Label label21;
        private System.Windows.Forms.Label label22;
        private System.Windows.Forms.Button btnInvtWrtie;
        private System.Windows.Forms.TextBox txtInvtRWData;
        private System.Windows.Forms.Label label26;
        private System.Windows.Forms.TextBox txtRwAccPassWord;
        private System.Windows.Forms.TextBox txtWordPtr0;
        private System.Windows.Forms.TextBox txtWordCnt0;
        private System.Windows.Forms.GroupBox gbxSelect;
        private System.Windows.Forms.Button btnSetSelect;
        private System.Windows.Forms.ComboBox cbxSelTarget;
        private System.Windows.Forms.ComboBox cbxAction;
        private System.Windows.Forms.ComboBox cbxSelMemBank;
        private System.Windows.Forms.Label label29;
        private System.Windows.Forms.Label label28;
        private System.Windows.Forms.Label label30;
        private System.Windows.Forms.TextBox txtSelPrt0;
        private System.Windows.Forms.TextBox txtSelPrt2;
        private System.Windows.Forms.TextBox txtSelPrt1;
        private System.Windows.Forms.TextBox txtSelPrt3;
        private System.Windows.Forms.Label label31;
        private System.Windows.Forms.Label label32;
        private System.Windows.Forms.TextBox txtSelLength;
        private System.Windows.Forms.CheckBox ckxTruncated;
        private System.Windows.Forms.TextBox txtSelMask;
        private System.Windows.Forms.Label label33;
        private System.Windows.Forms.Button btnGetSelect;
        private System.Windows.Forms.TextBox txtGetSelLength;
        private System.Windows.Forms.TextBox txtGetSelMask;
        private System.Windows.Forms.Label label34;
        private System.Windows.Forms.Label label35;
        private System.Windows.Forms.GroupBox gbxKill;
        private System.Windows.Forms.Label label44;
        private System.Windows.Forms.TextBox textBoxKillPwd;
        private System.Windows.Forms.Button buttonKill;
        private System.Windows.Forms.GroupBox gBxLock;
        private System.Windows.Forms.Button buttonLock;
        private System.Windows.Forms.Label label42;
        private System.Windows.Forms.TextBox textBoxLockAccessPwd;
        private System.Windows.Forms.Label labelKillRFU;
        private System.Windows.Forms.TextBox textBoxKillRFU;
        private System.Windows.Forms.CheckBox inv_mode;
        private System.Windows.Forms.Button btnSetFhss;
        private System.Windows.Forms.Button btnSetRegion;
        private System.Windows.Forms.Button btnGetChannel;
        private System.Windows.Forms.GroupBox gbxRfPower;
        private System.Windows.Forms.Button btnSetPaPower;
        private System.Windows.Forms.ComboBox cbxPaPower;
        private System.Windows.Forms.Button btnGetPaPower;
        private System.Windows.Forms.TextBox txtSendDelay;
        private System.Windows.Forms.PictureBox pbx_Inv_Indicator;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TabPage tabPage3;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.TextBox tbxSignalThreshold;
        private System.Windows.Forms.Label label23;
        private System.Windows.Forms.Button btnSetModemPara;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.ComboBox cbxMixerGain;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.ComboBox cbxIFAmpGain;
        private System.Windows.Forms.Button btnGetModemPara;
        private System.Windows.Forms.GroupBox groupBox2;
        private System.Windows.Forms.TextBox tbxCoupling;
        private System.Windows.Forms.Label label45;
        private System.Windows.Forms.TextBox tbxAntennaGain;
        private System.Windows.Forms.Label label43;
        private System.Windows.Forms.Button btnScanJammer;
        private System.Windows.Forms.ContextMenuStrip contextMenuStrip1;
        private System.Windows.Forms.ToolStripMenuItem saveAsCsvToolStripMenuItem;
        private BarChart.HBarChart hBarChartRssi;
        private System.Windows.Forms.Timer timerCheckReader;
        private System.Windows.Forms.Button Reset_FW;
        private System.Windows.Forms.Button btnScanRssi;
        private System.Windows.Forms.Timer tmrCheckEpc;
        private System.Windows.Forms.GroupBox gbxIoControl;
        private System.Windows.Forms.Button btnSetIO;
        private System.Windows.Forms.Button btnGetIO;
        private System.Windows.Forms.ComboBox cbxIO;
        private System.Windows.Forms.Button btnSetIoDirection;
        private System.Windows.Forms.Button btnSetMode;
        private System.Windows.Forms.ComboBox cbxMode;
        private System.Windows.Forms.CheckBox cbxSaveNvConfig;
        private System.Windows.Forms.GroupBox groupBox4;
        private System.Windows.Forms.ComboBox cbxIoDircetion;
        private System.Windows.Forms.ComboBox cbxIoLevel;
        private System.Windows.Forms.Button btnSetModuleSleep;
        private System.Windows.Forms.TextBox txtChIndexEnd;
        private System.Windows.Forms.TextBox txtChIndexBegin;
        private System.Windows.Forms.Button btnInsertRfCh;
        private System.Windows.Forms.Label label47;
        private System.Windows.Forms.Label label46;
        private System.Windows.Forms.Button btnChangeEas;
        private System.Windows.Forms.CheckBox cbxSetEas;
        private System.Windows.Forms.Button btnEasAlarm;
        private System.Windows.Forms.Button btnChangeConfig;
        private System.Windows.Forms.TextBox txtConfigData;
        private System.Windows.Forms.Label label48;
        private System.Windows.Forms.CheckBox cbxReadProtectReset;
        private System.Windows.Forms.Button btnReadProtect;
        private System.Windows.Forms.GroupBox groupBox5;
        private System.Windows.Forms.Button btnChangeBaudrate;
        private System.Windows.Forms.TextBox txtHardwareVersion;
        private System.Windows.Forms.Label labelHardwareVersion;
        private System.Windows.Forms.Label label25;
        private System.Windows.Forms.Label labelStatus;
        private System.Windows.Forms.TextBox txtOperateEpc;
        private System.Windows.Forms.GroupBox gbxStatus2;
        private System.Windows.Forms.RichTextBox rtbxStatus;
        private System.Windows.Forms.Label label27;
        private System.Windows.Forms.ComboBox cbxLockKillAction;
        private System.Windows.Forms.CheckBox checkBoxUser;
        private System.Windows.Forms.CheckBox checkBoxTID;
        private System.Windows.Forms.CheckBox checkBoxEPC;
        private System.Windows.Forms.CheckBox checkBoxAccessPwd;
        private System.Windows.Forms.CheckBox checkBoxKillPwd;
        private System.Windows.Forms.ComboBox cbxLockUserAction;
        private System.Windows.Forms.ComboBox cbxLockTIDAction;
        private System.Windows.Forms.ComboBox cbxLockEPCAction;
        private System.Windows.Forms.ComboBox cbxLockAccessAction;
        private System.Windows.Forms.Label label24;
        private System.Windows.Forms.TextBox tbxNxpCmdAccessPwd;
        private System.Windows.Forms.GroupBox groupBoxMonzaCmds;
        private System.Windows.Forms.Button btnMonzaQTWrite;
        private System.Windows.Forms.Button btnMonzaQTRead;
        private System.Windows.Forms.Label label36;
        private System.Windows.Forms.TextBox tbxMonzaQTAccessPwd;
        private System.Windows.Forms.CheckBox cbxMonzaQT_MEM;
        private System.Windows.Forms.CheckBox cbxMonzaQT_SR;
        private System.Windows.Forms.TextBox txtFirmwareVersion;
        private System.Windows.Forms.Label label37;
        private System.Windows.Forms.CheckBox ANT1;
        private System.Windows.Forms.CheckBox ANT8;
        private System.Windows.Forms.CheckBox ANT7;
        private System.Windows.Forms.CheckBox ANT6;
        private System.Windows.Forms.CheckBox ANT5;
        private System.Windows.Forms.CheckBox ANT4;
        private System.Windows.Forms.CheckBox ANT3;
        private System.Windows.Forms.CheckBox ANT2;
        private System.Windows.Forms.CheckBox ANT16;
        private System.Windows.Forms.CheckBox ANT15;
        private System.Windows.Forms.CheckBox ANT14;
        private System.Windows.Forms.CheckBox ANT13;
        private System.Windows.Forms.CheckBox ANT12;
        private System.Windows.Forms.CheckBox ANT11;
        private System.Windows.Forms.CheckBox ANT10;
        private System.Windows.Forms.CheckBox ANT9;
        private System.Windows.Forms.Button SetAnt;
        private System.Windows.Forms.TextBox AntStayTime;
        private System.Windows.Forms.Button bynSaveConfigToNv;
        private BarChart.HBarChart hBarChartJammer;
        private System.Windows.Forms.PictureBox image_lock;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.TextBox tv_sum;
        private System.Windows.Forms.Label lanel_sum;
        private System.Windows.Forms.Button btn_checkout;
        private System.Windows.Forms.Button btn_commit;
        private System.Windows.Forms.Label tv_notice;
        private System.Windows.Forms.Button btn_card_ready;
        //private System.IO.Ports.SerialPort ComDevice;
    }
}

