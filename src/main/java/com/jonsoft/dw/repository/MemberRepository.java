package com.jonsoft.dw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.lang.reflect.Member;


@NoRepositoryBean
public interface MemberRepository extends JpaRepository<Member,Long> {

}
