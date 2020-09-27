package com.example.demo;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.junit.jupiter.api.Test;
import static com.github.tomakehurst.wiremock.client.WireMock.*;


class DemoApplicationTests {

	public WireMockRule wireMockRule = new WireMockRule(8089); // No-args constructor defaults to port 8080

	@Test
	void contextLoads() {
		stubFor(get(urlEqualTo("/my/resource"))
				.withHeader("Accept", equalTo("text/xml"))
				.willReturn(aResponse()
						.withStatus(200)
						.withHeader("Content-Type", "text/xml")
						.withBody("<response>Some content</response>")));

//		Result result = myHttpServiceCallingObject.doSomething();
//
//		assertTrue(result.wasSuccessful());
//
//		verify(postRequestedFor(urlMatching("/my/resource/[a-z0-9]+"))
//				.withRequestBody(matching(".*<message>1234</message>.*"))
//				.withHeader("Content-Type", notMatching("application/json")));
	}

}
