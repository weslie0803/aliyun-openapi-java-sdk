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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.DescribeRefreshQuotaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRefreshQuotaResponse extends AcsResponse {

	private String requestId;

	private RefreshCacheQuota refreshCacheQuota;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public RefreshCacheQuota getRefreshCacheQuota() {
		return this.refreshCacheQuota;
	}

	public void setRefreshCacheQuota(RefreshCacheQuota refreshCacheQuota) {
		this.refreshCacheQuota = refreshCacheQuota;
	}

	public static class RefreshCacheQuota {

		private String urlQuota;

		private String dirQuota;

		private String urlRemain;

		private String dirRemain;

		public String getUrlQuota() {
			return this.urlQuota;
		}

		public void setUrlQuota(String urlQuota) {
			this.urlQuota = urlQuota;
		}

		public String getDirQuota() {
			return this.dirQuota;
		}

		public void setDirQuota(String dirQuota) {
			this.dirQuota = dirQuota;
		}

		public String getUrlRemain() {
			return this.urlRemain;
		}

		public void setUrlRemain(String urlRemain) {
			this.urlRemain = urlRemain;
		}

		public String getDirRemain() {
			return this.dirRemain;
		}

		public void setDirRemain(String dirRemain) {
			this.dirRemain = dirRemain;
		}
	}

	@Override
	public DescribeRefreshQuotaResponse getInstance(UnmarshallerContext context) {
		return	DescribeRefreshQuotaResponseUnmarshaller.unmarshall(this, context);
	}
}
