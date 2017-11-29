package test;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import com.hblg.bigdata.autun.remote.PingAnJieKouResponse;

public class Test001 {
	@Test
	public void test001(){
		StringBuilder builder = new StringBuilder("http://47.94.250.65/pinganjiekou/user/add?");
		builder.append("userName=123&");
		builder.append("userSex=123&");
		builder.append("userBirth=123&");
		builder.append("userPhone=123&");
		builder.append("userIdNo=123&");
		builder.append("province=123&");
		builder.append("city=123&");
		builder.append("town=123&");
		builder.append("channelCode=afangti_huhuabo_001&");
		builder.append("channelToken=-67-75-49-31-96-89-29-1191749116-528-4926-43&");
		builder.append("productCode=123");
		PingAnJieKouResponse forObject = new RestTemplate().getForObject(builder.toString(), PingAnJieKouResponse.class);
		
	}
	@Test
	public void test002() throws Exception, IOException{
		CloseableHttpClient build = HttpClientBuilder.create().build();
		CloseableHttpResponse execute = build.execute(new HttpGet("http://47.94.250.65/pinganjiekou/user/add"));
		System.out.println(EntityUtils.toString(execute.getEntity()));
	}
}
