# Azure Key Vault Administration for Java
> see https://aka.ms/autorest

### Setup
Increase max memory if you're using Autorest older than 3. Set the environment variable `NODE_OPTIONS` to `--max-old-space-size=8192`.

This is the AutoRest configuration file for the KeyVaultAccessControlClient and KeyVaultBackupClient.
---
## Getting Started
To build the SDK for either client, simply [Install AutoRest](https://github.com/Azure/autorest/blob/master/docs/install/readme.md) and in this folder, run:

> `autorest`

To see additional help and options, run:

> `autorest --help`

### Generation
There are three swagger specifications for KeyVault Administration: `rbac`, `backuprestore` and `settings`. They use the following tags respectively: `--tag=rbac`, `--tag=backuprestore`, `--tag=settings`.

```ps
cd <swagger-folder>
autorest --use=@autorest/java@4.1.15 --tag=${package}
```

e.g.
```ps
cd <swagger-folder>
autorest --use=@autorest/java@4.1.15 --tag=rbac
```

```ps
cd <swagger-folder>
autorest --use=@autorest/java@4.1.15 --tag=backuprestore
```

```ps
cd <swagger-folder>
autorest --use=@autorest/java@4.1.15 --tag=settings
```

## Code generation settings
``` yaml
java: true
output-folder: ../
namespace: com.azure.security.keyvault.administration
license-header: MICROSOFT_MIT_SMALL
models-subpackage: implementation.models
custom-types-subpackage: models
generate-client-as-impl: true
service-interface-as-public: true
enable-sync-stack: true
add-context-parameter: true
context-client-method-parameter: true
```

### Tag: rbac
These settings apply only when `--tag=rbac` is specified on the command line.

``` yaml $(tag) == 'rbac'
input-file: https://github.com/Azure/azure-rest-api-specs/blob/551275acb80e1f8b39036b79dfc35a8f63b601a7/specification/keyvault/data-plane/Microsoft.KeyVault/stable/7.4/rbac.json
title: KeyVaultAccessControlClient
```

### Tag: backuprestore
These settings apply only when `--tag=backuprestore` is specified on the command line.

``` yaml $(tag) == 'backuprestore'
input-file: https://github.com/Azure/azure-rest-api-specs/blob/551275acb80e1f8b39036b79dfc35a8f63b601a7/specification/keyvault/data-plane/Microsoft.KeyVault/stable/7.4/backuprestore.json
title: KeyVaultBackupClient
```

### Tag: settings
These settings apply only when `--tag=settings` is specified on the command line.

``` yaml $(tag) == 'settings'
input-file: https://github.com/Azure/azure-rest-api-specs/tree/551275acb80e1f8b39036b79dfc35a8f63b601a7/specification/keyvault/data-plane/Microsoft.KeyVault/stable/7.4/settings.json
title: KeyVaultSettingsClient
```
