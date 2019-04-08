package com.homeaway.streamplatform.hellostreams.usersessionprocessor.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class LoginDeclined extends CommandEvent {
    private String username;
}