package de.uniluebeck.itm.nettyprotocols.wisebednodeapi.packet.nodecontrol;

import de.uniluebeck.itm.nettyprotocols.wisebednodeapi.packet.Response;

/**
 * Created by IntelliJ IDEA.
 * User: nrohwedder
 * Date: 30.06.11
 * Time: 18:24
 * To change this template use File | Settings | File Templates.
 */
public class SetStartTimeResponse extends Response {

	public SetStartTimeResponse(final SetStartTimeRequest request) {
		super(request);
	}

	public short getTime() {
		return ((SetStartTimeRequest) request).getTime();
	}
}
