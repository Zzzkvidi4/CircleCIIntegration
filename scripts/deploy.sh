#!/bin/bash
echo ${CIRCLE_BRANCH}
if [[ ${CIRCLE_BRANCH} =~ dev ]]; then
   eb deploy circleciintegration-dev-env
elif [[ ${CIRCLE_BRANCH} =~ master ]]; then
   eb deploy circleciintegration-prod-env
fi