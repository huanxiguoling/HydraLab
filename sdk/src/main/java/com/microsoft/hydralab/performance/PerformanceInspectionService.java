// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.
package com.microsoft.hydralab.performance;

public enum PerformanceInspectionService implements IPerformanceInspectionService {
    INSTANCE;

    public static PerformanceInspectionService getInstance() {
        return INSTANCE;
    }

    private IPerformanceInspectionService serviceImplementation = new IPerformanceInspectionService() {
        @Override
        public PerformanceInspectionResult inspect(PerformanceInspection performanceInspection) {
            return null;
        }

        @Override
        public void inspectWithStrategy(PerformanceInspection performanceInspection, InspectionStrategy inspectionStrategy) {

        }

        @Override
        public PerformanceTestResult parse(PerformanceInspection performanceInspection, PerformanceResultParser.PerformanceResultParserType resultParser) {
            return null;
        }
    };

    void swapImplementation(IPerformanceInspectionService serviceImplementation) {
        this.serviceImplementation = serviceImplementation;
    }

    @Override
    public PerformanceInspectionResult inspect(PerformanceInspection performanceInspection) {
        return serviceImplementation.inspect(performanceInspection);
    }

    @Override
    public void inspectWithStrategy(PerformanceInspection performanceInspection, InspectionStrategy inspectionStrategy) {
        serviceImplementation.inspectWithStrategy(performanceInspection, inspectionStrategy);
    }

    @Override
    public PerformanceTestResult parse(PerformanceInspection performanceInspection, PerformanceResultParser.PerformanceResultParserType resultParser) {
        return serviceImplementation.parse(performanceInspection, resultParser);
    }
}
