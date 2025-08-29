package com.ankit.autogenerate;

//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import java.io.BufferedWriter;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.mock.web.MockHttpServletResponse;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;

//import com.ankit.*;

//@SpringBootTest//(classes = { LogInController.class })
//@ContextConfiguration
class OpenApiGeneratorTest {

//	@Value("${app.swagger.json.location}")
//    private String jsonPath/* = "swagggerJsonPath" */;
//
//	private MockMvc mockMvc;
//
//	@Autowired
//	private WebApplicationContext context;
//
//	@BeforeEach
//	public void setup() {
//		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
//	}
//
//	@Test
//	void createJson() {
//		String[] groups = { "swagger" };
//
//		for (String group : groups) {
//			MvcResult mvcResult;
//			try {
//              mvcResult = this.mockMvc.perform(get(
//                  "/v3/api-docs" /* + group */).accept("application/json;charset=UTF-8"))
//						.andExpect(status().isOk()).andReturn();
//				MockHttpServletResponse response = mvcResult.getResponse();
//				String swaggerJson = response.getContentAsString();
//
//				Files.createDirectories(Paths.get(jsonPath));
//
//                try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(jsonPath,
//                    "swagger" /* + group */ + ".json"),
//						StandardCharsets.UTF_8)) {
//					writer.write(swaggerJson);
//				}
//
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//
//	}
}
