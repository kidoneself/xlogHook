package com.kidself.vxlog;

import android.util.Log;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class vxLog implements IXposedHookLoadPackage {
    static String TAG = "vxLog";

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {
        XposedHelpers.findAndHookMethod("com.tencent.mm.xlog.app.XLogSetup", lpparam.classLoader, "keep_setupXLog",
                boolean.class, String.class, String.class, Integer.class, Boolean.class,
                Boolean.class, String.class, new XC_MethodHook() {
                    @Override
                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                        param.args[5] = true;
                    }

                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                        super.afterHookedMethod(param);
                        param.args[5] = true;
                        Log.i(TAG, "keep_setupXLog参数isLogcatOpen：" + param.args[5]);
                    }
                });

        /**
         * ===================================================================================
         */
        XposedHelpers.findAndHookMethod("com.tencent.mm.sdk.platformtools.ab", lpparam.classLoader, "b",
                String.class, String.class, Object[].class,
                new XC_MethodHook() {
                    @Override
                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                        String str = (String) param.args[0];
                        String str2 = (String) param.args[1];
                        Object[] objArr = (Object[]) param.args[2];
                        String format = objArr == null ? str2 : String.format(str2, objArr);
                        Log.e(TAG + "b" + str, format);
                        super.beforeHookedMethod(param);
                    }
                });
/**
 * ===================================================================================
 */
        XposedHelpers.findAndHookMethod("com.tencent.mm.sdk.platformtools.ab", lpparam.classLoader, "c",
                String.class, String.class, Object[].class,
                new XC_MethodHook() {
                    @Override
                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                        String str = (String) param.args[0];
                        String str2 = (String) param.args[1];
                        Object[] objArr = (Object[]) param.args[2];
                        String format = objArr == null ? str2 : String.format(str2, objArr);
                        Log.e(TAG + "c" + str, format);
                        super.beforeHookedMethod(param);
                    }
                });
/**
 * ===================================================================================
 */
        XposedHelpers.findAndHookMethod("com.tencent.mm.sdk.platformtools.ab", lpparam.classLoader, "d",
                String.class, String.class, Object[].class,
                new XC_MethodHook() {
                    @Override
                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                        String str = (String) param.args[0];
                        String str2 = (String) param.args[1];
                        Object[] objArr = (Object[]) param.args[2];
                        String format = objArr == null ? str2 : String.format(str2, objArr);
                        Log.e(TAG + "d" + str, format);
                        super.beforeHookedMethod(param);
                    }
                });
/**
 * ===================================================================================
 */
        XposedHelpers.findAndHookMethod("com.tencent.mm.sdk.platformtools.ab", lpparam.classLoader, "e",
                String.class, String.class, Object[].class,
                new XC_MethodHook() {
                    @Override
                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                        String str = (String) param.args[0];
                        String str2 = (String) param.args[1];
                        Object[] objArr = (Object[]) param.args[2];
                        String format = objArr == null ? str2 : String.format(str2, objArr);
                        Log.e(TAG + "e" + str, format);
                        super.beforeHookedMethod(param);
                    }
                });
/**
 * ===================================================================================
 */
        XposedHelpers.findAndHookMethod("com.tencent.mm.sdk.platformtools.ab", lpparam.classLoader, "f",
                String.class, String.class, Object[].class,
                new XC_MethodHook() {
                    @Override
                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                        String str = (String) param.args[0];
                        String str2 = (String) param.args[1];
                        Object[] objArr = (Object[]) param.args[2];
                        String format = objArr == null ? str2 : String.format(str2, objArr);
                        Log.e(TAG + "f" + str, format);
                        super.beforeHookedMethod(param);
                    }
                });
/**
 * ===================================================================================
 */
        XposedHelpers.findAndHookMethod("com.tencent.mm.sdk.platformtools.ab", lpparam.classLoader, "i",
                String.class, String.class, Object[].class,
                new XC_MethodHook() {
                    @Override
                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                        String str = (String) param.args[0];
                        String str2 = (String) param.args[1];
                        Object[] objArr = (Object[]) param.args[2];
                        String format = objArr == null ? str2 : String.format(str2, objArr);
                        Log.e(TAG + "i" + str, format);
                        super.beforeHookedMethod(param);
                    }
                });
/**
 * ===================================================================================
 */
        XposedHelpers.findAndHookMethod("com.tencent.mm.sdk.platformtools.ab", lpparam.classLoader, "v",
                String.class, String.class, Object[].class,
                new XC_MethodHook() {
                    @Override
                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                        String str = (String) param.args[0];
                        String str2 = (String) param.args[1];
                        Object[] objArr = (Object[]) param.args[2];
                        String format = objArr == null ? str2 : String.format(str2, objArr);
                        Log.e(TAG + "v" + str, format);
                        super.beforeHookedMethod(param);
                    }
                });
/**
 * ===================================================================================
 */
        XposedHelpers.findAndHookMethod("com.tencent.mm.sdk.platformtools.ab", lpparam.classLoader, "w",
                String.class, String.class, Object[].class,
                new XC_MethodHook() {
                    @Override
                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                        String str = (String) param.args[0];
                        String str2 = (String) param.args[1];
                        Object[] objArr = (Object[]) param.args[2];
                        String format = objArr == null ? str2 : String.format(str2, objArr);
                        Log.e(TAG + "w" + str, format);
                        super.beforeHookedMethod(param);
                    }
                });
    }


}
