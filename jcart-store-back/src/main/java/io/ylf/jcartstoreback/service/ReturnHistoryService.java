package io.ylf.jcartstoreback.service;

import io.ylf.jcartstoreback.po.ReturnHistory;

import java.util.List;

public interface ReturnHistoryService {

    List<ReturnHistory> getByReturnId(Integer returnId);
}
