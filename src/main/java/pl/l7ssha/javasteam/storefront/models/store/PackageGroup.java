package pl.l7ssha.javasteam.storefront.models.store;

import com.google.gson.annotations.SerializedName;

import java.util.List;

// pl.l7ssha.javasteam.storefront.models.store
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis
// Free for open source use, all changes send back to author
public class PackageGroup {
    private String name;
    private String title;
    private String description;

    @SerializedName("selection_text")
    private String selectionText;

    @SerializedName("display_type")
    private int displayType;

    @SerializedName("is_recurring_subscription")
    private boolean isRecurringSubscription;

    @SerializedName("subs")
    private List<PackageSubscription> subscriptions;
}