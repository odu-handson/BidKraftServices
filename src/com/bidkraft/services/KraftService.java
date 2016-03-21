package com.bidkraft.services;

import com.bidkraft.model.KraftRequest;

public interface KraftService<T> {
	
	public T service(KraftRequest request);

}
