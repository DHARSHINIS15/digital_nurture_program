package junit.Exercise2_VerifyingInteractions;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test; 
public class MyServiceTest {
	@Test
	public void testVerifyInteraction() {
		ExternalApi mockapi=mock(ExternalApi.class);
		MyService service=new MyService(mockapi);
		service.fetchData();
		verify(mockapi).getData();
		
	}
}
