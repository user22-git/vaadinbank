const div = document.createElement('div');
div.innerHTML = '<custom-style><style include="lumo-color lumo-typography"></style></custom-style>';
document.head.insertBefore(div.firstElementChild, document.head.firstChild);

import '@vaadin/flow-frontend/comboBoxConnector-es6.js';
import '@vaadin/flow-frontend/contextMenuConnector-es6.js';
import '@vaadin/flow-frontend/dndConnector-es6.js';
import '@vaadin/flow-frontend/flow-component-renderer.js';
import '@vaadin/flow-frontend/gridConnector-es6.js';
import '@vaadin/flow-frontend/vaadin-grid-flow-selection-column.js';
import '@vaadin/vaadin-button/theme/lumo/vaadin-button.js';
import '@vaadin/vaadin-checkbox/theme/lumo/vaadin-checkbox.js';
import '@vaadin/vaadin-combo-box/theme/lumo/vaadin-combo-box.js';
import '@vaadin/vaadin-context-menu/theme/lumo/vaadin-context-menu.js';
import '@vaadin/vaadin-grid/theme/lumo/vaadin-grid-column-group.js';
import '@vaadin/vaadin-grid/theme/lumo/vaadin-grid-column.js';
import '@vaadin/vaadin-grid/theme/lumo/vaadin-grid-sorter.js';
import '@vaadin/vaadin-grid/theme/lumo/vaadin-grid.js';
import '@vaadin/vaadin-item/theme/lumo/vaadin-item.js';
import '@vaadin/vaadin-list-box/theme/lumo/vaadin-list-box.js';
import '@vaadin/vaadin-login/theme/lumo/vaadin-login-form.js';
import '@vaadin/vaadin-lumo-styles/color.js';
import '@vaadin/vaadin-lumo-styles/icons.js';
import '@vaadin/vaadin-lumo-styles/sizing.js';
import '@vaadin/vaadin-lumo-styles/spacing.js';
import '@vaadin/vaadin-lumo-styles/style.js';
import '@vaadin/vaadin-lumo-styles/typography.js';
import '@vaadin/vaadin-ordered-layout/theme/lumo/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/theme/lumo/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/theme/lumo/vaadin-integer-field.js';
import '@vaadin/vaadin-text-field/theme/lumo/vaadin-number-field.js';
import '@vaadin/vaadin-text-field/theme/lumo/vaadin-text-field.js';
import '@vaadin/flow-frontend/comboBoxConnector.js';
import '@vaadin/flow-frontend/contextMenuConnector.js';
import '@vaadin/flow-frontend/dndConnector.js';
import '@vaadin/flow-frontend/gridConnector.js';
var scripts = document.getElementsByTagName('script');
var thisScript;
var elements = document.getElementsByTagName('script');
for (var i = 0; i < elements.length; i++) {
    var script = elements[i];
    if (script.getAttribute('type')=='module' && script.getAttribute('data-app-id') && !script['vaadin-bundle']) {
        thisScript = script;break;
     }
}
if (!thisScript) {
    throw new Error('Could not find the bundle script to identify the application id');
}
thisScript['vaadin-bundle'] = true;
if (!window.Vaadin.Flow.fallbacks) { window.Vaadin.Flow.fallbacks={}; }
var fallbacks = window.Vaadin.Flow.fallbacks;
fallbacks[thisScript.getAttribute('data-app-id')] = {}
fallbacks[thisScript.getAttribute('data-app-id')].loadFallback = function loadFallback(){
   return import('./generated-flow-imports-fallback.js');
}