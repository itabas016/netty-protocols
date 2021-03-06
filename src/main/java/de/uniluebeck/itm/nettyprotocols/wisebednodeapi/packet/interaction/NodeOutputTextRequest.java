package de.uniluebeck.itm.nettyprotocols.wisebednodeapi.packet.interaction;

import de.uniluebeck.itm.nettyprotocols.wisebednodeapi.packet.CommandType;
import de.uniluebeck.itm.nettyprotocols.wisebednodeapi.packet.Request;

/**
 * Created by IntelliJ IDEA.
 * User: nrohwedder
 * Date: 04.07.11
 * Time: 13:17
 * To change this template use File | Settings | File Templates.
 */
public class NodeOutputTextRequest extends Request {

	private final byte messageLevel;

	public NodeOutputTextRequest(final byte requestID, final byte messageLevel, final byte[] payload) {
		super(CommandType.Interaction.NODE_OUTPUT_TEXT, requestID, payload);
		this.messageLevel = messageLevel;

	}

	public byte getMessageLevel() {
		return messageLevel;
	}

}
