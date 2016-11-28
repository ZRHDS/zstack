package org.zstack.header.storage.primary;

import org.zstack.header.message.APIListMessage;

import java.util.List;

public class APIListPrimaryStorageMsg extends APIListMessage {

    public APIListPrimaryStorageMsg() {
    }

    public APIListPrimaryStorageMsg(List<String> uuids) {
        super(uuids);
    }
}
