package tw.brad.bs2.repository;

import org.springframework.data.repository.CrudRepository;

import tw.brad.bs2.model.UserV2;

/*
 * 基本款: CrudRepository 
 * 進階款: PaginAndSortRepository 
 * 高級款: JpaRepository
 * --------------------------------
 * save() => 增、修
 * saveAll(List, Set, Map, []) => 
 * 
 * deleteById() => 刪除
 * delete(物件)
 * 
 * findById() => 查詢
 * existsById() => true/false
 * 
 * count() => 筆數
 */
public interface UserRepository extends CrudRepository<UserV2, Long> {

	
	
}
