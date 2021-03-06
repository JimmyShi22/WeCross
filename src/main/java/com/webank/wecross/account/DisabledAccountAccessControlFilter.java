package com.webank.wecross.account;

import com.webank.wecross.exception.WeCrossException;
import com.webank.wecross.stub.Path;

public class DisabledAccountAccessControlFilter extends AccountAccessControlFilter {
    public DisabledAccountAccessControlFilter(String[] accountAllowPaths) throws WeCrossException {
        super(new String[0]);
    }

    @Override
    public boolean hasPermission(String path) throws WeCrossException {
        return true; // always true when access control disabled
    }

    @Override
    public boolean hasPermission(Path path) {
        return true; // always true when access control disabled
    }
}
