package io.presage;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import io.presage.Presage;
import io.presage.IADHandler;
import android.util.Log;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;
import org.apache.cordova.PluginResult.Status;

/**
 * This class is used to do Presage calls
 */
public class CPresage extends CordovaPlugin {

    private static final String AD_TO_SERVE		= "adToServe";
    private static final String LAUNCH_WITH_EULA	= "launchWithEula";
    private static final String LOAD			= "load";
    private static final String SHOW			= "show";
    private static final String CAN_SHOW		= "canShow";

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals(AD_TO_SERVE)) {
            adToServe(callbackContext);
            return true;
        }
	if (action.equals(LAUNCH_WITH_EULA)) {
	    launchWithEula(callbackContext);
            return true;
        }
	if (action.equals(LOAD)) {
            load(callbackContext);
            return true;
        }
	if (action.equals(SHOW)) {
            show(callbackContext);
            return true;
        }
	if (action.equals(CAN_SHOW)) {
	    canShow(callbackContext);
            return true;
        }
        return false;
    }

    @Override
    public void initialize(final CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        cordova.getActivity().runOnUiThread(new Runnable() {
            public void run() {
                Presage.getInstance().setContext(cordova.getActivity().getApplicationContext());
            }
        });
        this.start();
    }

    private void start() {
        cordova.getActivity().runOnUiThread(new Runnable() {
            public void run() {
                Presage.getInstance().start();
            }
        });
    }

    public void load(final CallbackContext callbackContext)
    {
	cordova.getActivity().runOnUiThread(new Runnable() {
		public void run() {
		    Presage.getInstance().load(new IADHandler() {
			    @Override
			    public void onAdAvailable() {
				PluginResult adFountResult = new PluginResult(PluginResult.Status.OK, "AdAvailable");
				adFountResult.setKeepCallback(false);
				callbackContext.sendPluginResult(adFountResult);
			    }
			    
			    @Override
			    public void onAdNotAvailable() {
				callbackContext.error("AdNotAvailable");
			    }
			    
			    @Override
			    public void onAdLoaded() {
				PluginResult adFountResult = new PluginResult(PluginResult.Status.OK, "AdLoaded");
				adFountResult.setKeepCallback(false);
				callbackContext.sendPluginResult(adFountResult);
			    }
			    
			    @Override
			    public void onAdClosed() {
				PluginResult adClosedResult = new PluginResult(PluginResult.Status.OK, "AdClosed");
				adClosedResult.setKeepCallback(true);
				callbackContext.sendPluginResult(adClosedResult);
			    }
			    
			    @Override
			    public void onAdError(int code) {

			    }
			    
			    @Override
			    public void onAdDisplayed() {

			    }
		
	    });
		}
	    });
    }

    public void canShow(final CallbackContext callbackContext){
	boolean r =  Presage.getInstance().canShow();
	callbackContext.sendPluginResult(new PluginResult(Status.OK, r));
	//callbackContext.sendPluginResult(r);
    }

    public void show(final CallbackContext callbackContext)
    {
	cordova.getActivity().runOnUiThread(new Runnable() {
		public void run() {
		    Presage.getInstance().show(new IADHandler() {
			    @Override
			    public void onAdAvailable() {
				PluginResult adFountResult = new PluginResult(PluginResult.Status.OK, "AdAvailable");
				adFountResult.setKeepCallback(false);
				callbackContext.sendPluginResult(adFountResult);
			    }
			    
			    @Override
			    public void onAdNotAvailable() {
				callbackContext.error("AdNotAvailable");
			    }
			    
			    @Override
			    public void onAdLoaded() {
				PluginResult adFountResult = new PluginResult(PluginResult.Status.OK, "AdLoaded");
				adFountResult.setKeepCallback(false);
				callbackContext.sendPluginResult(adFountResult);
			    }
			    
			    @Override
			    public void onAdClosed() {
				PluginResult adClosedResult = new PluginResult(PluginResult.Status.OK, "AdClosed");
				adClosedResult.setKeepCallback(true);
				callbackContext.sendPluginResult(adClosedResult);
			    }
			    
			    @Override
			    public void onAdError(int code) {

			    }
			    
			    @Override
			    public void onAdDisplayed() {

			    }
	    });
		}
	    });
    }
    
    public void launchWithEula(final CallbackContext callbackContext)
    {
	cordova.getActivity().runOnUiThread(new Runnable() {
		public void run() {
		    Presage.getInstance().launchWithEula( new IEulaHandler() {
			    @Override
			    public void onEulaFound() {
				PluginResult adFountResult = new PluginResult(PluginResult.Status.OK, "AdFound");
				adFountResult.setKeepCallback(false);
				callbackContext.sendPluginResult(adFountResult);
			    }
			    
			    @Override
			    public void onEulaNotFound() {
				PluginResult adNotFountResult = new PluginResult(PluginResult.Status.OK, "AdNotFound");
				adNotFountResult.setKeepCallback(false);
				callbackContext.sendPluginResult(adNotFountResult);
			    }
			    
			    @Override
			    public void onEulaClosed() {
				PluginResult adClosedResult = new PluginResult(PluginResult.Status.OK, "AdClosed");
				adClosedResult.setKeepCallback(true);
				callbackContext.sendPluginResult(adClosedResult);
			    }
			});
		}
	    });
    }
    
    private void adToServe(final CallbackContext callbackContext) {
        Presage.getInstance().adToServe( new IADHandler() {
		@Override
		public void onAdAvailable() {
		    PluginResult adFountResult = new PluginResult(PluginResult.Status.OK, "AdAvailable");
		    adFountResult.setKeepCallback(false);
		    callbackContext.sendPluginResult(adFountResult);
		}
		
		@Override
		public void onAdNotAvailable() {
		    callbackContext.error("AdNotAvailable");
		}
		
		@Override
		public void onAdLoaded() {
		    PluginResult adFountResult = new PluginResult(PluginResult.Status.OK, "AdLoaded");
		    adFountResult.setKeepCallback(false);
		    callbackContext.sendPluginResult(adFountResult);
		}
		
		@Override
		public void onAdClosed() {
		    PluginResult adClosedResult = new PluginResult(PluginResult.Status.OK, "AdClosed");
		    adClosedResult.setKeepCallback(true);
		    callbackContext.sendPluginResult(adClosedResult);
		}
		
		@Override
		public void onAdError(int code) {

		}
		
		@Override
		public void onAdDisplayed() {
		    
		}
	    });
    }
}
