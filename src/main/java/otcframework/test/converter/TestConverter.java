package otcframework.test.converter;

import java.util.Map;

import org.otcframework.common.converter.OtcConverter;

public class TestConverter implements OtcConverter {

	@Override
	public <S, T> T convert(S sourceObject, T targetObject, Map<String, Object> data) {
		// TODO Auto-generated method stub
		System.out.println("Testing - converter called!");
		return null;
	}

}
