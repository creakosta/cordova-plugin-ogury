var CPresage = {
    adToServe: function(onAdEvent, onAdNotFound) {
	cordova.exec(onAdEvent, onAdNotFound, 'CPresage', 'adToServe', [{}]);
    },
    launchWithEula: function(onAdEvent, onAdNotFound) {
	cordova.exec(onAdEvent, onAdNotFound, 'CPresage', 'launchWithEula', [{}]);
    },
    load: function(onAdEvent, onAdNotFound) {
	cordova.exec(onAdEvent, onAdNotFound, 'CPresage', 'load', [{}]);
    },
    show: function(onAdEvent, onAdNotFound) {
	cordova.exec(onAdEvent, onAdNotFound, 'CPresage', 'show', [{}]);
    },
    canShow: function(onAdEvent, onAdNotFound) {
	cordova.exec(onAdEvent, onAdNotFound,'CPresage', 'canShow', [{}]);
    }
};
