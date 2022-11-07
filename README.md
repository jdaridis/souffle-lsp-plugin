# Soufflé Datalog Language Server README

Soufflé is a logic programming language inspired by Datalog. Soufflé was initially designed for static program analysis and since then, there have been many other applications written in the Soufflé language, including applications in reverse engineering, network analysis and data analytics. 

This is a plugin adding basic smart features to the Soufflé language, using the Language Server Protocol.

 For syntax highlighting refer to: https://marketplace.visualstudio.com/items?itemName=W4RH4WK.souffle-syntax
## Features

- Automatic reparsing when saving the file.

- Syntax error reporting

![Syntax error message](images/syntax_error.png)

- Hover (Provide declaration info on hovers)
Provide documentation about relations taken from comments (for multiline comments use the /* */ style)
![Hover example](images/hover_1.png)

- Go to definition

![Go to definition example](images/definition.png)

- Go to Type Definition

![Go to type definition example](images/type_definition.png)

- Autocomplete

![Autocomplete example](images/autocomplete_1.png)

- Signature Help

![Signature Help example](images/signature_1.png)

- Rename

![Rename example](images/local_rename_1.png)

- Find all references

![References example](images/refernces.png)

- Find all rules for relation

![Rule references example](images/rule_reference.png)

- Document symbols

![Outline example](images/outline.png)

## Requirements

The user needs to have Java installed on their system.

## Build from source

To build the server jar file yourself just run `./gradlew jar` on the top level and the resulting jar will be under build/libs.

To run the server run `java -cp` with the name of the generated jar file.

For the VS Code plugin run `npm run package` and the resulting .js file will be under dist/extension.js

## Known Issues

In libraries with heavy use of the C preprocessor macros, sometimes parsing fails giving a false syntax error.

## Release Notes

### 0.1.2

Updated README
### 0.1.1

- Changed the grammar to be on par with Souffle.
- Added icon.
### 0.1.0

Initial release of Soufflé Datalog Language Server.
