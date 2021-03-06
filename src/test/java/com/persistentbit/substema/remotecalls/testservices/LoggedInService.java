package com.persistentbit.substema.remotecalls.testservices;

import com.persistentbit.core.collections.PList;
import com.persistentbit.core.result.Result;
import com.persistentbit.substema.annotations.Remotable;
import com.persistentbit.substema.annotations.RemoteCache;

/**
 * TODOC
 *
 * @author petermuys
 * @since 21/01/17
 */
@Remotable
public interface LoggedInService{

	@RemoteCache
	Result<String> getLoginName();

	Result<PList<TestValue>> getAllValues();
}
