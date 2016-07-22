require.config({

  // alias libraries paths
    paths: {
        'domReady': '../libs/requirejs-domready/domReady',
        'angular': '../libs/angular/angular'
    },

    // angular does not support AMD out of the box, put it in a shim
    shim: {
        'angular': {
            exports: 'angular'
        }
    },

    // kick start application
    deps: ['./bootstrap']
});