package com.linus.api.common;
import com.linus.api.enums.Messenger;

import java.util.List;
import java.util.Optional;

public abstract class AbstractService<T> {
    public abstract Messenger save(T t); //저장
    public abstract List<T> findAll();  //전체목록
    public abstract Optional<T> findById(Long id); //아이디찾기(컴퓨터용)
    public abstract String count(); //저장된회원수
    public abstract Optional<T> getOne(String id); //아이디찾기(유저아이디)
    public abstract String delete(T t); //삭제
    public abstract Boolean existsById(Long id);

}
