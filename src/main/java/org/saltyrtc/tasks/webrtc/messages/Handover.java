/*
 * Copyright (c) 2016-2019 Threema GmbH
 *
 * Licensed under the Apache License, Version 2.0, <see LICENSE-APACHE file>
 * or the MIT license <see LICENSE-MIT file>, at your option. This file may not be
 * copied, modified, or distributed except according to those terms.
 */

package org.saltyrtc.tasks.webrtc.messages;

import org.saltyrtc.client.annotations.NonNull;
import org.saltyrtc.client.messages.c2c.TaskMessage;

import java.util.HashMap;

public class Handover implements ToTaskMessage {
    @NonNull private static final String TYPE = "handover";

    @Override
    @NonNull public TaskMessage toTaskMessage() {
        return new TaskMessage(TYPE, new HashMap<>());
    }
}
