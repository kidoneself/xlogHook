package com.kidself.vxlog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getApplication(), "微信LOGHook", Toast.LENGTH_LONG).show();
    }



//    static public void keep_setupXLog(XC_LoadPackage.LoadPackageParam lpparam) {
//        XposedHelpers.findAndHookMethod("com.tencent.mm.xlog.app.XLogSetup", lpparam.classLoader, "keep_setupXLog",
//                boolean.class, String.class, String.class, Integer.class, Boolean.class,
//                Boolean.class, String.class, new XC_MethodHook() {
//                    @Override
//                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
//                        param.args[5] = true;
//                    }
//
//                    @Override
//                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
//                        super.afterHookedMethod(param);
//                        param.args[5] = true;
//                        Log.i(TAG,  "keep_setupXLog参数isLogcatOpen：" + param.args[5]);
//                    }
//                });
//    }

    /**
     * b
     * @param lpparam
     */
//    static private void platformtools_ab_Log_b(XC_LoadPackage.LoadPackageParam lpparam) {
//        XposedHelpers.findAndHookMethod("com.tencent.mm.sdk.platformtools.ab", lpparam.classLoader, "b",
//                String.class, String.class, Object[].class,
//                new XC_MethodHook() {
//                    @Override
//                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
//                        String str  = (String) param.args[0];
//                        String str2  = (String) param.args[1];
//                        Object[] objArr= (Object[]) param.args[2];
//                        String format = objArr == null ? str2 : String.format(str2, objArr);
//                        Log.e(TAG+"b"+str,format);
//                        super.beforeHookedMethod(param);
//                    }
//                });
//    }
    /**
     * c
     * @param lpparam
     */
//    static private void platformtools_ab_Log_c(XC_LoadPackage.LoadPackageParam lpparam) {
//        XposedHelpers.findAndHookMethod("com.tencent.mm.sdk.platformtools.ab", lpparam.classLoader, "c",
//                String.class, String.class, Object[].class,
//                new XC_MethodHook() {
//                    @Override
//                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
//                        String str  = (String) param.args[0];
//                        String str2  = (String) param.args[1];
//                        Object[] objArr= (Object[]) param.args[2];
//                        String format = objArr == null ? str2 : String.format(str2, objArr);
//                        Log.e(TAG+"c"+str,format);
//                        super.beforeHookedMethod(param);
//                    }
//                });
//    }

    /**
     * d
     * @param lpparam
     */
//    static private void platformtools_ab_Log_d(XC_LoadPackage.LoadPackageParam lpparam) {
//        XposedHelpers.findAndHookMethod("com.tencent.mm.sdk.platformtools.ab", lpparam.classLoader, "d",
//                String.class, String.class, Object[].class,
//                new XC_MethodHook() {
//                    @Override
//                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
//                        String str  = (String) param.args[0];
//                        String str2  = (String) param.args[1];
//                        Object[] objArr= (Object[]) param.args[2];
//                        String format = objArr == null ? str2 : String.format(str2, objArr);
//                        Log.e(TAG+"d"+str,format);
//                        super.beforeHookedMethod(param);
//                    }
//                });
//    }


    /**
     * e
     * @param lpparam
     */
//    static private void platformtools_ab_Log_e(XC_LoadPackage.LoadPackageParam lpparam) {
//        XposedHelpers.findAndHookMethod("com.tencent.mm.sdk.platformtools.ab", lpparam.classLoader, "e",
//                String.class, String.class, Object[].class,
//                new XC_MethodHook() {
//                    @Override
//                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
//                        String str  = (String) param.args[0];
//                        String str2  = (String) param.args[1];
//                        Object[] objArr= (Object[]) param.args[2];
//                        String format = objArr == null ? str2 : String.format(str2, objArr);
//                        Log.e(TAG+"e"+str,format);
//                        super.beforeHookedMethod(param);
//                    }
//                });
//    }
    /**
     * f
     * @param lpparam
     */
//    static private void platformtools_ab_Log_f(XC_LoadPackage.LoadPackageParam lpparam) {
//        XposedHelpers.findAndHookMethod("com.tencent.mm.sdk.platformtools.ab", lpparam.classLoader, "f",
//                String.class, String.class, Object[].class,
//                new XC_MethodHook() {
//                    @Override
//                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
//                        String str  = (String) param.args[0];
//                        String str2  = (String) param.args[1];
//                        Object[] objArr= (Object[]) param.args[2];
//                        String format = objArr == null ? str2 : String.format(str2, objArr);
//                        Log.e(TAG+"f"+str,format);
//                        super.beforeHookedMethod(param);
//                    }
//                });
//    }

    /**
     * i
     * @param lpparam
     */
//    static private void platformtools_ab_Log_i(XC_LoadPackage.LoadPackageParam lpparam) {
//        XposedHelpers.findAndHookMethod("com.tencent.mm.sdk.platformtools.ab", lpparam.classLoader, "i",
//                String.class, String.class, Object[].class,
//                new XC_MethodHook() {
//                    @Override
//                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
//                        String str  = (String) param.args[0];
//                        String str2  = (String) param.args[1];
//                        Object[] objArr= (Object[]) param.args[2];
//                        String format = objArr == null ? str2 : String.format(str2, objArr);
//                        Log.e(TAG+"i"+str,format);
//                        super.beforeHookedMethod(param);
//                    }
//                });
//    }

    /**
     * v
     * @param lpparam
     */
//    static private void platformtools_ab_Log_v(XC_LoadPackage.LoadPackageParam lpparam) {
//        XposedHelpers.findAndHookMethod("com.tencent.mm.sdk.platformtools.ab", lpparam.classLoader, "v",
//                String.class, String.class, Object[].class,
//                new XC_MethodHook() {
//                    @Override
//                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
//                        String str  = (String) param.args[0];
//                        String str2  = (String) param.args[1];
//                        Object[] objArr= (Object[]) param.args[2];
//                        String format = objArr == null ? str2 : String.format(str2, objArr);
//                        Log.e(TAG+"v"+str,format);
//                        super.beforeHookedMethod(param);
//                    }
//                });
//    }

    /**
     * w
     * @param lpparam
     */
//    static private void platformtools_ab_Log_w(XC_LoadPackage.LoadPackageParam lpparam) {
//        XposedHelpers.findAndHookMethod("com.tencent.mm.sdk.platformtools.ab", lpparam.classLoader, "w",
//                String.class, String.class, Object[].class,
//                new XC_MethodHook() {
//                    @Override
//                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
//                        String str  = (String) param.args[0];
//                        String str2  = (String) param.args[1];
//                        Object[] objArr= (Object[]) param.args[2];
//                        String format = objArr == null ? str2 : String.format(str2, objArr);
//                        Log.e(TAG+"w"+str,format);
//                        super.beforeHookedMethod(param);
//                    }
//                });
//    }


    /**
     * w
     * @param lpparam
     */
//    static private void platformtools_ab_Log_printErrStackTrace(XC_LoadPackage.LoadPackageParam lpparam) {
//        XposedHelpers.findAndHookMethod("com.tencent.mm.sdk.platformtools.ab", lpparam.classLoader, "printErrStackTrace",
//                String.class, String.class, Object[].class,
//                new XC_MethodHook() {
//                    @Override
//                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
//                        String str  = (String) param.args[0];
//                        String str2  = (String) param.args[1];
//                        Object[] objArr= (Object[]) param.args[2];
//                        String format = objArr == null ? str2 : String.format(str2, objArr);
//                        Log.e(TAG+"printErrStackTrace"+str,format);
//                        super.beforeHookedMethod(param);
//                    }
//                });
//    }


}
