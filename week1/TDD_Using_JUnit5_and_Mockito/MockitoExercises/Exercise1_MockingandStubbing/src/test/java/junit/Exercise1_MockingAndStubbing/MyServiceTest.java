package junit.Exercise1_MockingAndStubbing;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*; 
import org.junit.jupiter.api.Test; 
import org.mockito.Mockito;
public class MyServiceTest {
	@Test
	public void externalApiTest() {
		ExternalApi api=mock(ExternalApi.class);
		when(api.getData()).thenReturn("Mock data");
		MyService service=new MyService(api);
		String result=service.fetchData();
		assertEquals(result,"Mock data");
	}
}
