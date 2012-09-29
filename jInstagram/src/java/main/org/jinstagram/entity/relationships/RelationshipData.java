package org.jinstagram.entity.relationships;

import com.google.gson.annotations.SerializedName;

public class RelationshipData {
	public static final String FOLLOWS_STATUS =			"follows";
	public static final String REQUESTED_STATUS =		"requested";
	public static final String NONE_STATUS = 			"none";
	public static final String FOLLOWED_BY_STATUS =		"followed_by";
	public static final String REQUESTED_BY_STATUS = 	"requested_by";
	public static final String BLOCKED_BY_YOU_STATUS =	"blocked_by_you";
	
	@SerializedName("incoming_status")
	private String incomingStatus;

	@SerializedName("outgoing_status")
	private String outgoingStatus;

	/**
	 * @return the outgoingStatus
	 */
	public String getOutgoingStatus() {
		return outgoingStatus;
	}

	/**
	 * @param outgoingStatus the outgoingStatus to set
	 */
	public void setOutgoingStatus(String outgoingStatus) {
		this.outgoingStatus = outgoingStatus;
	}

	/**
	 * @return the incomingStatus
	 */
	public String getIncomingStatus() {
		return incomingStatus;
	}

	/**
	 * @param incomingStatus the incomingStatus to set
	 */
	public void setIncomingStatus(String incomingStatus) {
		this.incomingStatus = incomingStatus;
	}

    @Override
    public String toString() {
        return String.format("RelationshipData [incomingStatus=%s, outgoingStatus=%s]", incomingStatus, outgoingStatus);
    }
}
