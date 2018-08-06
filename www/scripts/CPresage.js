var CPresage = {

    presageSdk: {
        initializeSdk: function (onAdEvent, onAdNotFound, apiKey) {
            cordova.exec(onAdEvent, onAdNotFound, 'CPresage', 'initializeSdk', [apiKey]);
        }
    },
    presageInterstitial: {        
        load: function(onAdEvent, onAdError) {
            cordova.exec(onAdEvent, onAdError, 'CPresage', 'load', [{}]);
        },
        show: function(onAdEvent, onAdNotFound) {
            cordova.exec(onAdEvent, onAdNotFound, 'CPresage', 'show', [{}]);
        },
        isLoaded: function(onAdEvent, onAdNotFound) {
            cordova.exec(onAdEvent, onAdNotFound, 'CPresage', 'isLoaded', [{}]);
        },
        setAdUnit: function(onAdEvent, onAdError, adUnit) {
            cordova.exec(onAdEvent, onAdError, 'CPresage', 'setAdUnit', [adUnit]);
        }
    },
	presageOptinVideo: {
        load: function(onAdEvent, onAdError) {
            cordova.exec(onAdEvent, onAdError, 'CPresage', 'optinVideoLoad', [{}]);
        },
        show: function(onAdEvent, onAdNotFound) {
            cordova.exec(onAdEvent, onAdNotFound, 'CPresage', 'optinVideoShow', [{}]);
        },
        isLoaded: function(onAdEvent, onAdNotFound) {
            cordova.exec(onAdEvent, onAdNotFound, 'CPresage', 'optinVideoIsLoaded', [{}]);
        },
        setAdUnit: function(onAdEvent, onAdError, adUnit) {
            cordova.exec(onAdEvent, onAdError, 'CPresage', 'optinVideoSetAdUnit', [adUnit]);
        },
        setUserId: function(onAdEvent, onAdError) {
            cordova.exec(onAdEvent, onAdError, 'CPresage', 'SetUserId', [userId]);
        }
    },
    presageEula: {
        launchWithEula: function(onAdEvent, onAdNotFound) {
            cordova.exec(onAdEvent, onAdNotFound, 'CPresage', 'launchWithEula', [{}]);
        }
    }
};