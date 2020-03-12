package com.pngyul.springboot.mapper;



import com.pngyul.springboot.entities.Provider;

import java.util.List;

/*
 * Copyright (c) 2019
 * @Author:pngyul@yeah.net
 * @LastModified:2019-03-28 18:38:05
 */


//@Mapper 或 @MapperScan("com.mengxuegu.springboot.mapper")
public interface ProviderMapper {

    List<Provider> getProviders(Provider provider);

    Provider getProviderByPid(Integer pid);

    int addProvider(Provider provider);

    int deleteProviderByPid(Integer pid);

    int updateProvider(Provider provider);

}
