package com.krissu.logic.rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import com.krissu.client.ClientEmulator;
import com.krissu.client.Utilities;
import com.krissu.logic.ActionType;
import com.krissu.logic.Controller;

@Rule(name = "AvailabilityRule", description = "Guarrantee the minimum number of slaves")
public class AvailabilityNotEnoughRule {

	private ClientEmulator c;
	private int readQueueSize;

	@Condition
	public boolean checkNumSlave() {
		// The rule should be applied only if
		// the number of slaves is less than minimum.
		return readQueueSize < Utilities.minimumSlave;
	}

	@Action
	public void addServer() throws Exception {
		c.getEventQueue().put(ActionType.AvailNotEnoughAddServer);
	}

	public void setInput(ClientEmulator c, int readQueueSize) {
		this.c = c;
		this.readQueueSize = readQueueSize;
	}

}
