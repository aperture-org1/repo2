package com.paloaltonetworks.aperture.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;

import java.util.Objects;

/**
 * DTO for Google Drive User's data
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GoogleDriveUserDTO {
    @JsonProperty("quotaBytesUsedAggregate")
    private Long quotaBytesUsedAggregate;
    @JsonProperty("quotaBytesTotal")
    private Long quotaBytesTotal;
    @JsonProperty("quotaBytesUsedInrash")
    private Long quotaBytesUsedInTrash;
    @JsonProperty("quotaBytesUsed")
    private Long quotaBytesUsed;
    @JsonProperty("currentAppInstalled")
    private boolean currentAppInstalled;
    @JsonProperty("rootFolderId")
    private String rootFolderId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("permissionId")
    private String permissionId;

    public GoogleDriveUserDTO(){};

    public GoogleDriveUserDTO(Long quotaBytesUsedAggregate, Long quotaBytesTotal, Long quotaBytesUsedInTrash, Long
            quotaBytesUsed, boolean currentAppInstalled, String rootFolderId, String name, String permissionId) {
        this.quotaBytesUsedAggregate = quotaBytesUsedAggregate;
        this.quotaBytesTotal = quotaBytesTotal;
        this.quotaBytesUsedInTrash = quotaBytesUsedInTrash;
        this.quotaBytesUsed = quotaBytesUsed;
        this.currentAppInstalled = currentAppInstalled;
        this.rootFolderId = rootFolderId;
        this.name = name;
        this.permissionId = permissionId;
    }

    public Long getQuotaBytesUsedAggregate() {
        return quotaBytesUsedAggregate;
    }

    public void setQuotaBytesUsedAggregate(Long quotaBytesUsedAggregate) {
        this.quotaBytesUsedAggregate = quotaBytesUsedAggregate;
    }

    public Long getQuotaBytesTotal() {
        return quotaBytesTotal;
    }

    public void setQuotaBytesTotal(Long quotaBytesTotal) {
        this.quotaBytesTotal = quotaBytesTotal;
    }

    public Long getQuotaBytesUsedInTrash() {
        return quotaBytesUsedInTrash;
    }

    public void setQuotaBytesUsedInTrash(Long quotaBytesUsedInTrash) {
        this.quotaBytesUsedInTrash = quotaBytesUsedInTrash;
    }

    public Long getQuotaBytesUsed() {
        return quotaBytesUsed;
    }

    public void setQuotaBytesUsed(Long quotaBytesUsed) {
        this.quotaBytesUsed = quotaBytesUsed;
    }

    public boolean isCurrentAppInstalled() {
        return currentAppInstalled;
    }

    public void setCurrentAppInstalled(boolean currentAppInstalled) {
        this.currentAppInstalled = currentAppInstalled;
    }

    public String getRootFolderId() {
        return rootFolderId;
    }

    public void setRootFolderId(String rootFolderId) {
        this.rootFolderId = rootFolderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GoogleDriveUserDTO that = (GoogleDriveUserDTO) o;
        return currentAppInstalled == that.currentAppInstalled
                && Objects.equals(quotaBytesUsedAggregate, that.quotaBytesUsedAggregate)
                && Objects.equals(quotaBytesTotal, that.quotaBytesTotal)
                && Objects.equals(quotaBytesUsedInTrash, that.quotaBytesUsedInTrash)
                && Objects.equals(quotaBytesUsed, that.quotaBytesUsed)
                && Objects.equals(rootFolderId, that.rootFolderId)
                && Objects.equals(name, that.name)
                && Objects.equals(permissionId, that.permissionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotaBytesUsedAggregate, quotaBytesTotal, quotaBytesUsedInTrash, quotaBytesUsed,
                currentAppInstalled, rootFolderId, name, permissionId);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("quotaBytesUsedAggregate", quotaBytesUsedAggregate)
                .add("quotaBytesTotal", quotaBytesTotal)
                .add("quotaBytesUsedInTrash", quotaBytesUsedInTrash)
                .add("quotaBytesUsed", quotaBytesUsed)
                .add("currentAppInstalled", currentAppInstalled)
                .add("rootFolderId", rootFolderId)
                .add("name", name)
                .add("permissionId", permissionId)
                .toString();
    }
}
