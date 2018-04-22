package pl.l7ssha.javasteam.storefront.store;

import com.google.gson.annotations.SerializedName;

import java.util.List;

// pl.l7ssha.javasteam.storefront.models.store
//
// Date created: 01 Apr 2018
// Author: Szymon 'l7ssha' Uglis

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

    public PackageGroup() { }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getSelectionText() {
        return selectionText;
    }

    public int getDisplayType() {
        return displayType;
    }

    public boolean isRecurringSubscription() {
        return isRecurringSubscription;
    }

    public List<PackageSubscription> getSubscriptions() {
        return subscriptions;
    }
}
