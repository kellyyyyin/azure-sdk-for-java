// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.generated;

import com.azure.core.util.Context;

/** Samples for Accounts ListByResourceGroup. */
public final class AccountsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/deviceupdate/resource-manager/Microsoft.DeviceUpdate/stable/2022-10-01/examples/Accounts/Accounts_List.json
     */
    /**
     * Sample code: Gets list of Accounts.
     *
     * @param manager Entry point to DeviceUpdateManager.
     */
    public static void getsListOfAccounts(com.azure.resourcemanager.deviceupdate.DeviceUpdateManager manager) {
        manager.accounts().listByResourceGroup("test-rg", Context.NONE);
    }
}
