package hello.jdbc.repository;

import hello.jdbc.domain.Member;

import java.sql.SQLException;

public interface MemberRepositoryEx {
    Member save(Member member) throws SQLException;
    Member findById(String memberId) throws SQLException;
    Member update(String memberId, int money)throws SQLException ;
    Member delete(String memberId) throws SQLException;
}
