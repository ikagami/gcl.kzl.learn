package gcl.kzl.feign.client.service;

import gcl.kzl.feign.client.response.PeopleInfoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "GCL.KZL.MYBATIS")
public interface PersonFeignClient
{
    @GetMapping("/people/info/{id}")
    PeopleInfoResponse queryPeopleInfo(@PathVariable("id")String id);
}
