package com.springGgg;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(
        name="SEARCH_SEQ_GEN", //������ ���ʷ����� �̸�
        sequenceName="SEARCH_SEQ", //������ �̸�
        initialValue=1, //���۰�
        allocationSize=1 //�޸𸮸� ���� �Ҵ��� ���� ������
        )
public class MySearchHist {
	@Id
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE,
			generator="SEARCH_SEQ_GEN"
			)
	private Integer seq;
	
	@Column(length=50,nullable=false)
	private String id;
	
	@Column(length=100,nullable=false)
	private String keyWord;

	@Column(length=16,nullable=false)
	private String searchDt;
	
	public MySearchHist() { super(); }
	public MySearchHist(Integer seq,String id,String keyWord,String searchDt) {
		this.seq = seq;
		this.id = id;
		this.keyWord = keyWord;
		this.searchDt = searchDt;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	public String getSearchDt() {
		return searchDt;
	}
	public void setSearchDt(String searchDt) {
		this.searchDt = searchDt;
	}
}
