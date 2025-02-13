// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for KeyPermissions. */
public final class KeyPermissions extends ExpandableStringEnum<KeyPermissions> {
    /** Static value all for KeyPermissions. */
    public static final KeyPermissions ALL = fromString("all");

    /** Static value encrypt for KeyPermissions. */
    public static final KeyPermissions ENCRYPT = fromString("encrypt");

    /** Static value decrypt for KeyPermissions. */
    public static final KeyPermissions DECRYPT = fromString("decrypt");

    /** Static value wrapKey for KeyPermissions. */
    public static final KeyPermissions WRAP_KEY = fromString("wrapKey");

    /** Static value unwrapKey for KeyPermissions. */
    public static final KeyPermissions UNWRAP_KEY = fromString("unwrapKey");

    /** Static value sign for KeyPermissions. */
    public static final KeyPermissions SIGN = fromString("sign");

    /** Static value verify for KeyPermissions. */
    public static final KeyPermissions VERIFY = fromString("verify");

    /** Static value get for KeyPermissions. */
    public static final KeyPermissions GET = fromString("get");

    /** Static value list for KeyPermissions. */
    public static final KeyPermissions LIST = fromString("list");

    /** Static value create for KeyPermissions. */
    public static final KeyPermissions CREATE = fromString("create");

    /** Static value update for KeyPermissions. */
    public static final KeyPermissions UPDATE = fromString("update");

    /** Static value import for KeyPermissions. */
    public static final KeyPermissions IMPORT = fromString("import");

    /** Static value delete for KeyPermissions. */
    public static final KeyPermissions DELETE = fromString("delete");

    /** Static value backup for KeyPermissions. */
    public static final KeyPermissions BACKUP = fromString("backup");

    /** Static value restore for KeyPermissions. */
    public static final KeyPermissions RESTORE = fromString("restore");

    /** Static value recover for KeyPermissions. */
    public static final KeyPermissions RECOVER = fromString("recover");

    /** Static value purge for KeyPermissions. */
    public static final KeyPermissions PURGE = fromString("purge");

    /**
     * Creates or finds a KeyPermissions from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding KeyPermissions.
     */
    @JsonCreator
    public static KeyPermissions fromString(String name) {
        return fromString(name, KeyPermissions.class);
    }

    /**
     * Gets known KeyPermissions values.
     *
     * @return known KeyPermissions values.
     */
    public static Collection<KeyPermissions> values() {
        return values(KeyPermissions.class);
    }
}
