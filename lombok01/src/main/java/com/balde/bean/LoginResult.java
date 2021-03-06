package com.balde.bean;

import java.net.URL;
import java.time.Duration;
import java.time.Instant;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@RequiredArgsConstructor
@Accessors(fluent = true) @Getter
public class LoginResult {

	private final @NonNull String loginTs;
	
	private final @NonNull String authToken;
	private final @NonNull String tokenValidity;
	
	private final @NonNull String tokenRefreshUrl;
}
