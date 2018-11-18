package pt.tfae.oreolockscreenalbumartremover;

import de.robv.android.xposed.*;
import de.robv.android.xposed.callbacks.*;

public class OreoLockScreenAlbumArtRemover implements IXposedHookLoadPackage {
//  private static final String TAG = OreoLockScreenAlbumArtRemover.class.getSimpleName() + ": ";

  public void handleLoadPackage(final XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {

    if(lpparam.packageName.equals("com.android.systemui")) {
      try {
        XposedHelpers.findAndHookMethod("com.android.systemui.statusbar.phone.StatusBar", lpparam.classLoader, "updateMediaMetaData", boolean.class, boolean.class, new XC_MethodReplacement() {
          @Override
          protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
            return null;
          }
        });
      } catch(Throwable t) {
//        XposedBridge.log(TAG + t);
      }
    }
  }
}
