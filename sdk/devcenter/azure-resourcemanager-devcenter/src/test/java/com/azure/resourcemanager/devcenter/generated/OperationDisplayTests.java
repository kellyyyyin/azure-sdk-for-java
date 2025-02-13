// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.OperationDisplay;
import org.junit.jupiter.api.Test;

public final class OperationDisplayTests {
    @Test
    public void testDeserialize() {
        OperationDisplay model =
            BinaryData
                .fromString(
                    "{\"provider\":\"vwpm\",\"resource\":\"aruoujmkcjhwqyt\",\"operation\":\"ybn\",\"description\":\"ewgdrjervn\"}")
                .toObject(OperationDisplay.class);
    }

    @Test
    public void testSerialize() {
        OperationDisplay model = new OperationDisplay();
        model = BinaryData.fromObject(model).toObject(OperationDisplay.class);
    }
}
