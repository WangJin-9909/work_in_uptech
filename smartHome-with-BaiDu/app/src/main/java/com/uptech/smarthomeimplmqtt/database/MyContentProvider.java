package com.uptech.smarthomeimplmqtt.database;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class MyContentProvider extends ContentProvider {
    private static final String TAG = "MyContentProvider";
    private static final String AUTHORITIES = "com.uptech.smarthomeimplmqtt";
    public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITIES);

    public static Uri getUri(String tail)
    {
        Uri uri;
        if(tail == null) return CONTENT_URI;
        return Uri.parse("content://" + AUTHORITIES + "/" + tail);
    }
    @Override
    public boolean onCreate() {
        return false;
    }

    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        return null;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues values) {
        DBOperation db = DBOperation.getInstance(getContext());
        if(uri == null ) uri = CONTENT_URI;
        long row = db.insert(values);
        db.closeDB();
        if(row != -1)
        {
            getContext().getContentResolver().notifyChange(uri,null);
        }
        return uri;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }
}
