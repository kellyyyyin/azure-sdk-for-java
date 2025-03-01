// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.administration.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The SKU for the messaging entity. */
public final class MessagingSku extends ExpandableStringEnum<MessagingSku> {
    /** Static value Basic for MessagingSku. */
    public static final MessagingSku BASIC = fromString("Basic");

    /** Static value Standard for MessagingSku. */
    public static final MessagingSku STANDARD = fromString("Standard");

    /** Static value Premium for MessagingSku. */
    public static final MessagingSku PREMIUM = fromString("Premium");

    /**
     * Creates or finds a MessagingSku from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MessagingSku.
     */
    @JsonCreator
    public static MessagingSku fromString(String name) {
        return fromString(name, MessagingSku.class);
    }

    /**
     * Gets known MessagingSku values.
     *
     * @return known MessagingSku values.
     */
    public static Collection<MessagingSku> values() {
        return values(MessagingSku.class);
    }
}
