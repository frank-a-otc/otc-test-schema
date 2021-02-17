package otcl.test.converter;

import java.util.Map;

import org.otcl2.common.converter.OtclConverter;


public class TestConverter implements OtclConverter {

	@Override
	public <S, T> T convert(S sourceObject, T targetObject, Map<String, Object> data) {
		// TODO Auto-generated method stub
		System.out.println("Testing - converter called!");
		return null;
	}

}
