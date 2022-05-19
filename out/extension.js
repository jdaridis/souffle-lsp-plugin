"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.deactivate = exports.activate = void 0;
const extension_1 = require("./main/vs-code/extension");
function activate(context) {
    //Set the context of the extension instance
    extension_1.extensionInstance.setContext(context);
    //Initialize the LS Client extension instance.
    extension_1.extensionInstance.init().catch((error) => {
        console.log("Failed to activate Ballerina extension. " + (error));
    });
}
exports.activate = activate;
function deactivate() { }
exports.deactivate = deactivate;
//# sourceMappingURL=extension.js.map