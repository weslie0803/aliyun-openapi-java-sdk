/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetVideoPlayInfoRequest extends RpcAcsRequest<GetVideoPlayInfoResponse> {
	
	public GetVideoPlayInfoRequest() {
		super("vod", "2017-03-21", "GetVideoPlayInfo", "vod");
	}

	private String signVersion;

	private Long resourceOwnerId;

	private String clientVersion;

	private String resourceOwnerAccount;

	private String channel;

	private String playSign;

	private String videoId;

	private Long ownerId;

	private Long clientTS;

	public String getSignVersion() {
		return this.signVersion;
	}

	public void setSignVersion(String signVersion) {
		this.signVersion = signVersion;
		if(signVersion != null){
			putQueryParameter("SignVersion", signVersion);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getClientVersion() {
		return this.clientVersion;
	}

	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
		if(clientVersion != null){
			putQueryParameter("ClientVersion", clientVersion);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
		if(channel != null){
			putQueryParameter("Channel", channel);
		}
	}

	public String getPlaySign() {
		return this.playSign;
	}

	public void setPlaySign(String playSign) {
		this.playSign = playSign;
		if(playSign != null){
			putQueryParameter("PlaySign", playSign);
		}
	}

	public String getVideoId() {
		return this.videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
		if(videoId != null){
			putQueryParameter("VideoId", videoId);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Long getClientTS() {
		return this.clientTS;
	}

	public void setClientTS(Long clientTS) {
		this.clientTS = clientTS;
		if(clientTS != null){
			putQueryParameter("ClientTS", clientTS.toString());
		}
	}

	@Override
	public Class<GetVideoPlayInfoResponse> getResponseClass() {
		return GetVideoPlayInfoResponse.class;
	}

}
