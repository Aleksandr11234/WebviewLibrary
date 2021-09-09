package com.app.webviewlibrary;

import android.content.Context;
import android.widget.Toast;

public class Test {

    public static void createToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

}
