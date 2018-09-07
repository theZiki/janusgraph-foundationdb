// Copyright 2017 JanusGraph Authors
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.experoinc.janusgraph.graphdb.foundationdb;

import com.experoinc.janusgraph.FoundationDBStorageSetup;

import com.palantir.docker.compose.DockerComposeRule;
import org.janusgraph.diskstorage.configuration.WriteConfiguration;
import org.janusgraph.graphdb.JanusGraphPartitionGraphTest;
import org.junit.ClassRule;

/**
 * @author Ted Wilmes (twilmes@gmail.com)
 */
public class FoundationDBPartitionGraphTest extends JanusGraphPartitionGraphTest {

    @ClassRule
    public static DockerComposeRule docker = FoundationDBStorageSetup.startFoundationDBDocker();

    @Override
    public WriteConfiguration getBaseConfiguration() {
        return FoundationDBStorageSetup.getFoundationDBGraphConfiguration();
    }
}